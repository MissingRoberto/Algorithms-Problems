package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixSpinalTest {

	@Test
	public void test() {

		int[][] matrix = new int[][]{
			new int[]{1,2,3,4},
			new int[]{10,11,12, 5},
			new int[]{9,8,7,6}
		};
		
		MatrixSpinal.printSpinal(matrix);
	}

}
