package dynamicnrecursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClimbStairTest {

	@Test
	public void testRecursive() {
		assertEquals(0, ClimbStair.climbWaysRecursive(0));
		assertEquals(1, ClimbStair.climbWaysRecursive(1));
		assertEquals(2, ClimbStair.climbWaysRecursive(2));
		assertEquals(-1, ClimbStair.climbWaysRecursive(-5));
		assertEquals(3, ClimbStair.climbWaysRecursive(3));
		assertEquals(5, ClimbStair.climbWaysRecursive(4));
	}

	@Test
	public void testIterative() {
		assertEquals(0, ClimbStair.climbWaysIterative(0));
		assertEquals(1, ClimbStair.climbWaysIterative(1));
		assertEquals(2, ClimbStair.climbWaysIterative(2));
		assertEquals(-1, ClimbStair.climbWaysIterative(-5));
		assertEquals(3, ClimbStair.climbWaysIterative(3));
		assertEquals(5, ClimbStair.climbWaysIterative(4));
	}

}
