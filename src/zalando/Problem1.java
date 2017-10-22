package zalando;

public class Problem1 {

	public int solution(int[] A) {

		int[] leftMaximum = new int[A.length];
		int[] rightMinimum = new int[A.length];

		int currentMaximum = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			if (currentMaximum < A[i]) {
				currentMaximum = A[i];
			}
			leftMaximum[i] = currentMaximum;
		}

		int currentMinimum = Integer.MAX_VALUE;
		for (int i = A.length - 1; i >= 0; i--) {
			if (currentMinimum > A[i]) {
				currentMinimum = A[i];
			}
			rightMinimum[i] = currentMinimum;
		}

		for (int i = 1; i < A.length; i++) {
			if (leftMaximum[i - 1] < rightMinimum[i])
				return i;
		}

		return -1;
	}
}
