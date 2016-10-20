package arraysnstrings;

import java.util.ArrayList;
import java.util.Arrays;

public class Pair {

	public int a;
	public int b;

	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	public static ArrayList<Pair> findPairs(int[] array, int X) {
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		Arrays.sort(array);
		int start = 0;
		int end = array.length - 1;
		System.out.println(Arrays.toString(array));
		while (start != end) {
			int sum = array[start] + array[end];
			if (sum == X) {
				pairs.add(new Pair(array[start], array[end]));
			}

			if (X < sum) {
				end--;
			} else {
				start++;
			}
		}

		return pairs;
	}

}
