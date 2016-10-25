package arraysnstrings;

public class WaterContainer {

	public int findMaxArea(int[] array) {

		if (array.length == 0) {
			return 0;
		}

		int maxArea = 0;

		int left = 0;
		int right = array.length - 1;
		while (left != right) {
			int gap = right - left;
			int area = gap * Math.min(array[left], array[right]);
			maxArea = Math.max(area, maxArea);

			if (array[left] < array[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;

	}
}
