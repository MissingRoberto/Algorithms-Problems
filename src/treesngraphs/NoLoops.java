package treesngraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class NoLoops {

	public static boolean canFinish(int numCourses, int[][] prerequisites) {

		if (prerequisites.length == 0 || numCourses == 0) {
			return true;
		}
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

		for (int[] prereq : prerequisites) {
			int course = prereq[0];
			ArrayList<Integer> required;
			if (map.containsKey(course)) {
				required = map.get(course);
			} else {
				required = new ArrayList<Integer>();
			}
			required.add(prereq[1]);
			map.put(course, required);
		}
		int[] visited = new int[numCourses];

		for (int course : map.keySet()) {
			if(visited[course] != 2){
				if(!dfsNotLoop(visited,map,course))
					return false;
			}
		}

		return true;
	}

	private static boolean dfsNotLoop(int[] visited, HashMap<Integer, ArrayList<Integer>> map, int start) {
		if (visited[start] == 1)
			return false;

		visited[start] = 1;

		if (map.get(start) != null) {
			for (int r : map.get(start)) {
				if (visited[r] == 2)
					continue;
				if (!dfsNotLoop(visited, map, r))
					return false;
			}
		}

		visited[start] = 2;
		return true;

	}
	
	public static int[] findOrder(int numCourses, int[][] prerequisites) {
		if (numCourses == 0)
			return new int[0];
		
		int[] numPrereqs = new int[numCourses];
		
		for(int[] prereq: prerequisites)
			numPrereqs[prereq[0]]++;
		
		// Enqueue all courses without prerequisites
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int course=0; course<numCourses;course++ ){
			if(numPrereqs[course]==0)
				queue.offer(course);
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while (!queue.isEmpty()){
			int course = queue.poll();
			result.add(course);
			for(int[] prereq : prerequisites){
				if(prereq[1] == course){
					numPrereqs[prereq[0]]--;
					if(numPrereqs[prereq[0]] == 0){
						queue.offer(numPrereqs[prereq[0]]);
					}
				}
			}
		}
		
		if (result.size() != numCourses)
			return new int[0]; 
		
		
		int[] arr = new int[result.size()];
		for(int i = 0; i < result.size(); i++) {
		    arr[i] = result.get(i);
		}
		
		return arr; 
	}
}
