package arraysnstrings;

import java.util.BitSet;

public class ZeroMatrix {

	public static void clear(int[][] matrix) {
		int M = matrix.length;
		if (M == 0)
			return;
		int N = matrix[0].length;

		BitSet columsToClear = new BitSet(N);
		BitSet rowsToClear = new BitSet(M);

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 0) {
					columsToClear.set(j);
					rowsToClear.set(i);
				}
			}
		}

		int rowToClear = rowsToClear.nextSetBit(0);
		while (rowToClear > 0) {
			matrix[rowToClear] = new int[N];
		}

		int columnToClear = columsToClear.nextSetBit(0);
		while (columnToClear > 0) {
			for (int i = 0; i < M; i++) {
				matrix[i][columnToClear] = 0;
			}
		}

	}
}
