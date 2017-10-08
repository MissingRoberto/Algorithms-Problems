package searchnsort;

import java.util.HashSet;

public class SmallestPositiveInteger {
	public int solution(int[] A) {
		HashSet<Integer> found = new HashSet<Integer>();

		for (int i : A) {
			if (i > 0) {
				found.add(i);
			}
		}

		int result = 1;
		while (found.contains(result)) {
			result++;
		}

		return result;
	}
}
