package arraysnstrings;

public class Palindrome {

	private static boolean isValidChar(char c) {
		return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
	}

	public static boolean isPalindrome(String word) {

		if (word.length() == 0)
			return true;

		int start = 0;
		int end = word.length() - 1;

		word = word.toLowerCase();

		while (start <= end) {
			char c1 = word.charAt(start);
			char c2 = word.charAt(end);
			if (!isValidChar(c1)) {
				start++;
				continue;
			}

			if (!isValidChar(c2)) {
				end--;
				continue;
			}

			if (c1 != c2)
				return false;
			start++;
			end--;
		}

		return true;

	}

}
