package dynamicnrecursion;

public class MagicIndex {
	
	public static int findMagicIndex(int[] array, int start, int end){
		if (end < start){
			return -1;
		}
		
		int middle = (start + end)/2;
		
		if(middle == array[middle]){
			return middle;
		}else if(array[middle] < middle){
			return findMagicIndex(array,middle+1,end);
		}else{
			return findMagicIndex(array,start,middle-1);
		}
		
	}
	
	public static int findMagicIndexNotUnique(int[] array, int start, int end){
		if (end < start){
			return -1;
		}
		
		int middle = (start + end)/2;
		
		if(middle == array[middle]){
			return middle;
		}
		
		int endLeft = Math.min(array[middle], middle);
		int value = findMagicIndexNotUnique(array, start, endLeft);
		
		if (value > 0){
			return value; 
		}
		
		int startRight = Math.max(array[middle], middle);
		
		return findMagicIndexNotUnique(array, startRight, end);
	}
	
}
