package stacksnqueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerifyPreOrderTest {

	@Test
	public void test() {
		assertTrue(VerifyPreOrder.verifyPreOrder(new int[]{4,2,1,3,6,5,7}));
		assertTrue(VerifyPreOrder.verifyPreOrder(new int[]{4,2,1,3,6,5}));
		assertFalse(VerifyPreOrder.verifyPreOrder(new int[]{4,2,5,3,6,5,7}));
	}

}
