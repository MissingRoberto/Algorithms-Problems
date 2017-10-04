package arraysnstrings;

public class SubStringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		for (int i = 0; i + k - 1 < s.length(); i++) {
			String substring = s.substring(i, i + k);

			if (smallest.isEmpty() || substring.compareTo(smallest) < 0)
				smallest = substring;

			if (largest.isEmpty() || substring.compareTo(largest) > 0)
				largest = substring;
		}

		return smallest + "\n" + largest;
	}
}
