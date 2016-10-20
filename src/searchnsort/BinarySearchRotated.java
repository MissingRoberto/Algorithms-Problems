package searchnsort;

public class BinarySearchRotated {

	private static boolean couldContain(int[] numbers, int start, int end, int value){
		if (numbers[start] <= numbers[end]){
			return value <= numbers[end] && value >= numbers[start];
		}else{
			return value >= numbers[start] && value <= numbers[end];
		}
	}
	
	
	public static int search(int[] numbers, int value){
		if (numbers.length == 0)
			return -1;
		
		int left = 0; 
		int right = numbers.length-1; 
		
		while (left <= right ){
			int mid = (right + left)/2;
			if (numbers[mid] == value)
				return mid;
			
			if(couldContain(numbers, mid+1, right, value)){
				left = mid+1; 
			}else{
				right = mid - 1; 
			}
			
		}
		return -1; 
	}
}
