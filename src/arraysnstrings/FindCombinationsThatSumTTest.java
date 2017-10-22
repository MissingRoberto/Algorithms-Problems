package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindCombinationsThatSumTTest {

	@Test
	public void test() {
		assertEquals(-1, FindCombinationsThatSumT.findCombinations(-1));
		assertEquals(0, FindCombinationsThatSumT.findCombinations(0));
		assertEquals(1, FindCombinationsThatSumT.findCombinations(1));
		assertEquals(2, FindCombinationsThatSumT.findCombinations(2));
		assertEquals(2, FindCombinationsThatSumT.findCombinations(3));
		assertEquals(6, FindCombinationsThatSumT.findCombinations(6));
	}

}
