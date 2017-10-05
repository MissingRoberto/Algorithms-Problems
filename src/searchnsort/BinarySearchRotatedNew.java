package searchnsort;

public class BinarySearchRotatedNew {

	public static int searchRecursive(int[] array, int value, int left, int right) {
		if (left < right)
			return -1;
		
		int mid = (right - left) / 2;
		if (array[mid] == value) {
			return mid;
		} else if (array[mid] < array[right] && array[mid] < value) {
			return searchRecursive(array, value,mid - 1,right);
		} else if (array[mid] > array[left] && array[mid] > value) {
			return searchRecursive(array, value,left,mid + 1);
		} else if (array[left] > array[mid] && array[mid] < value) {
			return searchRecursive(array, value,left,mid + 1);
		} else {
			return searchRecursive(array, value,mid - 1,right);
		}
	}

	public static int search(int[] array, int value) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = (right - left) / 2;

			if (array[mid] == value) {
				return mid;
			} else if (array[mid] < array[right] && array[mid] < value) {
				left = mid - 1;
			} else if (array[mid] > array[left] && array[mid] > value) {
				right = mid + 1;
			} else if (array[left] > array[mid] && array[mid] < value) {
				right = mid + 1;
			} else {
				left = mid - 1;
			}

		}

		return -1;
	}
}
