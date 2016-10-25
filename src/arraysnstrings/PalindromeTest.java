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

}
