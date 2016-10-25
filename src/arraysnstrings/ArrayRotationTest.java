package arraysnstrings;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayRotationTest {

	@Test
	public void test() {

		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int[] expected = new int[] { 3, 4, 5, 1, 2 };
		int[] result = ArrayRotation.rotateArray(array, 3);
		assertTrue(Arrays.equals(expected, result));
	}

	@Test
	public void testReverse() {

		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int[] expected = new int[] { 3, 4, 5, 1, 2 };
		ArrayRotation.rotateArrayReverse(array, 3);
		assertTrue(Arrays.equals(expected, array));
	}

}
