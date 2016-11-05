package searchnsort;

public class SearchInterspersed {

	public static int find(String[] words, String word) {
		if (words.length == 0)
			return -1;

		return find(words, word, 0, words.length - 1);
	}

	private static int find(String[] words, String word, int start, int end) {
		if (start >= end)
			return -1;

		int middle = (start + end) / 2;
		int left = middle;
		while (left > start && words[left].length() == 0)
			left--;

		if (words[left].equals(word))
			return left;
		else if (!words[left].isEmpty() && word.compareTo(words[left]) < 0)
			return find(words, word, start, left - 1);

		int right = middle;
		while (right < end && words[right].isEmpty())
			right++;

		if (words[right].equals(word))
			return right;
		else if (words[right].isEmpty())
			return -1;
		else
			return find(words, word, right + 1, end);

	}
}
