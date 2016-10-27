package arraysnstrings;

public class MinDistance {

	
	public static int minDistance(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0)
			return Math.max(s2.length(), s2.length());

		int i = 0;
		int j = 0;
		int counter = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			} else if (s1.charAt(i + 1) == s1.charAt(j + 1)) {
				// Replace
				i++;
				j++;
				counter++;
			}
		}

		return counter + Math.max(s1.length() - i, s2.length() - j);
	}
}
