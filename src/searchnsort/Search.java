package searchnsort;

public class Search {

	public static int searchSortedNRotated(int[] array, int value){
		return searchSortedNRotated(array, value, 0, array.length-1); 
	}
	public static int searchSortedNRotated(int[] array, int value, int start, int end) {
		int middle = (start + end) / 2;
		System.out.println(value+" start:"+start+", end:" + end+", middle:"+middle);
		if (end < start) {
			return -1;
		}

		if (array[middle] == value) {
			return middle;
		}
		
		
		if ((value <= array[end]) && (value > array[middle])
				|| (value <= array[end]) && (value > array[middle]) ) {
			System.out.println(value + " Search  right");
			return searchSortedNRotated(array, value, middle + 1, end);
		}else if ( value > array[middle]){
			return searchSortedNRotated(array, value, middle + 1, end);
		} else {
			System.out.println(value + " Search left");
			return searchSortedNRotated(array, value, start, middle - 1);
		}
	}
}
