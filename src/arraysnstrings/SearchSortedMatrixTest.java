package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchSortedMatrixTest {

	@Test
	public void test() {

		int[][] matrix = new int[][]{
			new int[]{1,2,3},
			new int[]{6,8,9},
			new int[]{10,11,12}
		};

		assertTrue(SearchSortedMatrix.search(matrix,1));
		assertTrue(SearchSortedMatrix.search(matrix,12));
		assertFalse(SearchSortedMatrix.search(matrix,7));
		assertFalse(SearchSortedMatrix.search(matrix,-10));

	}

}
