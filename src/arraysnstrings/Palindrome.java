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

	public static String longestPalindrome(String word) {

		String res = "";
		for (int i = 0; i < word.length(); i++) {
			String evenPalindrome = evenUnfold(word, i);
			String oddPalindrome = oddUnfold(word, i);
			String win = (evenPalindrome.length() > oddPalindrome.length()) ? evenPalindrome : oddPalindrome;
			res = (win.length() > res.length()) ? win : res;

		}
		return res;
	}

	public static String oddUnfold(String word, int i) {
		int left = i - 1;
		int right = i + 1;

		while (left >= 0 && right < word.length() && word.charAt(left) == word.charAt(right)) {
			left--;
			right++;
		}
		return word.substring(left + 1, right);
	}

	public static String evenUnfold(String word, int i) {
		int left = i;
		int right = i + 1;

		while (left >= 0 && right < word.length() && word.charAt(left) == word.charAt(right)) {
			left--;
			right++;
		}
		return word.substring(left + 1, right);
	}

}
