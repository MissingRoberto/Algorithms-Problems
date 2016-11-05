package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncodeArrayIntsTest {

	@Test
	public void test() {
		assertEquals(0, EncodeArrayInts.combinations(new int[] {}));
		assertEquals(1, EncodeArrayInts.combinations(new int[] { 1 }));
		assertEquals(2, EncodeArrayInts.combinations(new int[] { 1, 2 }));
		assertEquals(3, EncodeArrayInts.combinations(new int[] { 1, 2, 3 }));
		assertEquals(5, EncodeArrayInts.combinations(new int[] { 1, 2, 2, 3 }));
		assertEquals(3, EncodeArrayInts.combinations(new int[] { 1, 2, 3, 4 }));

	}

}
