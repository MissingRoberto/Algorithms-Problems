package treesngraphs;

public class GraphNode {
	
	
	private static int[] initialize(int n){
		int[] array = new int[n];
		for(int i =0; i< n; i++){
			array[i] = i; 
		}
		
		return array;
	}
	public static int countComponents(int n, int[][] edges){
		int count = n;
		int[] roots = initialize(n);
		for(int[] edge: edges){
			int n1 = findRoot(roots, edge[0]);
			int n2 = findRoot(roots, edge[1]);
			
			if (n1 != n2){
				roots[n1] = n2;
				count--;
			}
			
		}
		return count;
	}

	public static int findRoot(int[] roots, int i){
		while(roots[i]!=i){
			i = roots[i];
		}
		return roots[i];
	}
}
