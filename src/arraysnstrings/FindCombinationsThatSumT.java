package arraysnstrings;

public class FindCombinationsThatSumT {
	// Limitation: Valid Only unique numbers
	
	private static int findCombinations(int[] combinations, int n){
	    if ( n < 0 )
	        return -1;
	    if ( n == 0 )
	        return 0;
	    
	    if ( combinations[n] != 0 )
	    	return combinations[n];
	    

	    int index = 1;
	    
	    combinations[n] = 1;
	    
	    while ( n - index  >= n/2.0 ) {
	    	combinations[n] += findCombinations(index);
	        index++;
	    }
	    
	    return combinations[n];
	}
	
	
	public static int findCombinations(int n){
		return findCombinations(new int[n+1],n);
	}
	
	
}
