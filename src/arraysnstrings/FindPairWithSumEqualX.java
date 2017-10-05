package arraysnstrings;

import java.util.Arrays;
import java.util.HashMap;

public class FindPairWithSumEqualX {
	
	
    // O(N) in time O(N) in space
	
	public static int[] findPairWithSumEqualsXWithHash(int[] array, int X){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i= 0; i< array.length; i++){
			map.put(array[i], i);
		}
		
		for(int i= 0; i< array.length; i++){
			if (map.get(X -array[i]) != null){
				return new int[]{i, map.get(X-array[i])};
			}
		}
	    
		return null;
	}
	
	// O(NlogN)
	public static int[] findPairWithSumEqualsX(int[] array, int X){
		Arrays.sort(array);
		
		int left = 0; int right = array.length -1;
		
		while (left < right){
			int sum = array[left] + array[right];
			
			if ( sum == X ){
				return new int[]{left,right};
			}else if(sum > X){
				right--;
			}else{
				left--;
			}	
		}	
		
		return null;
	}
}
