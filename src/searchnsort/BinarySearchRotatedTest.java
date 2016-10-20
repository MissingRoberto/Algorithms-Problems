package searchnsort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchRotatedTest {

	@Test
	public void test() {
		int[] numbers = new int[]{-2,2,4,-5,-3};
		assertEquals(2,BinarySearchRotated.search(numbers,4));
		assertEquals(3,BinarySearchRotated.search(numbers,-5));
		assertEquals(-1,BinarySearchRotated.search(numbers,1));
		assertEquals(-1,BinarySearchRotated.search(numbers,5));
		assertEquals(-1,BinarySearchRotated.search(numbers,-8));
		assertEquals(1,BinarySearchRotated.search(numbers,2));
		assertEquals(4,BinarySearchRotated.search(numbers,-3));
		assertEquals(0,BinarySearchRotated.search(numbers,-2));
	}

}
