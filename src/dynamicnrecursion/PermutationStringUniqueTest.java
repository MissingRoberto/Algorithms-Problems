package dynamicnrecursion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PermutationStringUniqueTest {

	@Test
	public void test() {
		assertEquals(new String[]{"a"}, PermutationStringUnique.permutation("a"));
		assertEquals(new String[]{}, PermutationStringUnique.permutation(""));
		assertEquals(new String[]{"ba", "ab"}, PermutationStringUnique.permutation("ab"));
		assertEquals(new String[]{"bac", "abc","acb", "bca","cab", "cba"}, PermutationStringUnique.permutation("abc"));
	}

}
