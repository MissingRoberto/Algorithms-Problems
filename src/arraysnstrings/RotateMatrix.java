package arraysnstrings;

public class RotateMatrix {

	private static void rotateCorners(int[][] matrix, int corner, int N, int i) {

		int up = matrix[corner][corner + i];
		int left = matrix[corner + N - 1 - i][corner];
		int right = matrix[corner + i][corner + N - 1];
		int down = matrix[corner + N - 1][corner + N - 1 - i];

		matrix[corner][corner + i] = left;
		matrix[corner + N - 1 - i][corner] = down;
		matrix[corner + N - 1][corner + N - 1 - i] = right;
		matrix[corner + i][corner + N - 1] = up;

	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void rotateArray(int[][] matrix) {

		int N = matrix.length;
		int corner = 0;
		while (N > 0) {
			for (int i = corner; i < N - 1; i++) {
				rotateCorners(matrix, corner, N, i);
			}
			N--;
			corner++;
		}
	}
}
