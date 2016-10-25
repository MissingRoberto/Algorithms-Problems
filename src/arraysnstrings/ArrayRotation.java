package arraysnstrings;

public class ArrayRotation {

	private static void swap(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}

	private static void reverse(int[] array, int start, int end) {
		while (start < end) {
			swap(array, start, end);
			start++;
			end--;
		}
	}

	public static void rotateArrayReverse(int[] array, int K) {
		int k = K % array.length;
		if (array.length == 0 || k == 0) {
			return;
		}

		reverse(array, 0, k - 2);
		reverse(array, k - 1, array.length - 1);
		reverse(array, 0, array.length - 1);

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
