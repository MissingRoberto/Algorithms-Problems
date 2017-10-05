package arraysnstrings;

public class ArrayRotation {

	private static void swap(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}

	
	private static void reverse(int[] array, int start, int length){
		int left = start;
		int right = start + length-1;
		while (left < right) {
			swap(array, left, right);
			left++; right--;
		}
	}
	
	// O(2N) = O(N)
	public static void rotateArrayReverse(int[] array, int k){
		k = k % array.length;
		if (array.length == 0 || k == 0) {
			return;
		}
		
		reverse(array, 0, array.length);
		reverse(array, 0, k);
		reverse(array,k,array.length-k);
	}


	// Drawback O(N) in space
	public static int[] rotateArray(int[] array, int K) {
		int k = K % array.length;
		if (array.length == 0 || k == 0) {
			return null;
		}

		int[] rotated = new int[array.length];

		int index = 0;
		int indexRotated = k;
		// Copy the first part of the array to the end of the rotated

		while (indexRotated < array.length) {
			rotated[indexRotated] = array[index];
			index++;
			indexRotated++;
		}
		indexRotated = 0;

		// Copy the rest into the beginning of the rotated
		while (indexRotated < k) {
			rotated[indexRotated] = array[index];
			index++;
			indexRotated++;
		}
		return rotated;
	}
}
