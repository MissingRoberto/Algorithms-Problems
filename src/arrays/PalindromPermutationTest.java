package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromPermutationTest {

	@Test
	public void testIsPalindromPermutationHash() {
		assertTrue(PalindromPermutation.isPalindromPermutationHash("nun"));
	}
	
	@Test
	public void testIsPalindromPermutationHashNegative() {
		assertFalse(PalindromPermutation.isPalindromPermutationHash("un"));
	}
	
	@Test
	public void testIsPalindromPermutationHashEven() {
		assertTrue(PalindromPermutation.isPalindromPermutationHash("nunu"));
	}
	
	
	@Test
	public void testIsPalindromPermutationVector() {
		assertTrue(PalindromPermutation.isPalindromPermutationVector("nun"));
	}
	
	@Test
	public void testIsPalindromPermutationVectorEven() {
		assertTrue(PalindromPermutation.isPalindromPermutationVector("nunu"));
	}
	
	@Test
	public void testIsPalindromPermutationVectorNegative() {
		assertFalse(PalindromPermutation.isPalindromPermutationVector("un"));
	}

}
