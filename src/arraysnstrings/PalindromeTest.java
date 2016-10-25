package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void test() {
		assertTrue(Palindrome.isPalindrome("a"));
		assertTrue(Palindrome.isPalindrome(""));
		assertTrue(Palindrome.isPalindrome("aa"));
		assertFalse(Palindrome.isPalindrome("ab"));
		assertTrue(Palindrome.isPalindrome("aba"));
	}

	@Test
	public void testLongestPalindrome() {
		assertEquals("", Palindrome.longestPalindrome(""));
		assertEquals("aa", Palindrome.longestPalindrome("aa"));
		assertEquals("a", Palindrome.longestPalindrome("ab"));
		assertEquals("bbabb", Palindrome.longestPalindrome("cbbabb"));
		assertEquals("bbbb", Palindrome.longestPalindrome("cbbbbd"));

	}
}
