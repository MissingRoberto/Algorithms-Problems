package dynamicnrecursion;

import java.util.ArrayList;

public class PowerSet {
	public static ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> list){
		ArrayList<Integer> set=(ArrayList<Integer>) list.clone();
		// Return an empty array if input set has less than 2 elements
		if (set.size()  < 1){
			return new ArrayList<ArrayList<Integer>>();
		}else if(set.size() == 1){
			ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> itself = new ArrayList<Integer>();
			itself.add(set.get(0));
			subsets.add(itself);
			System.out.println(itself.toString());
			return subsets;
		}else{
			ArrayList<Integer> lastElement = new ArrayList<Integer>();
			lastElement.add(set.get(set.size()-1));
			set.remove(set.size()-1);
			ArrayList<ArrayList<Integer>> subsets = powerSet(set);
			ArrayList<ArrayList<Integer>> newSubsets =  new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset: subsets){
				ArrayList<Integer> newSubset = (ArrayList<Integer>) subset.clone(); 
				newSubset.addAll(lastElement);
				newSubsets.add(newSubset);
				System.out.println(newSubset.toString());
			}
			
			subsets.addAll(powerSet(lastElement));
			subsets.addAll(newSubsets);
			return subsets;
		}
	}
}
