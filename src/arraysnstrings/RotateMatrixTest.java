package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateMatrixTest {

	@Test
	public void test() {
		 int[][] matrix = new int[3][3];
		 matrix[0]= new int[]{0,1,2};
		 matrix[1]= new int[]{3,4,5};
		 matrix[2]= new int[]{6,7,8};
//		int[][] matrix = new int[2][2];
//		matrix[0] = new int[] { 0, 1 };
//		matrix[1] = new int[] { 2, 3 };

		RotateMatrix.printMatrix(matrix);
		RotateMatrix.rotateArray(matrix);
		RotateMatrix.printMatrix(matrix);
	}

}
