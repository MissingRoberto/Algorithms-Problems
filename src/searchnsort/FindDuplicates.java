package searchnsort;

import java.util.ArrayList;
import java.util.BitSet;

public class FindDuplicates {

	private static int N = 32000;

	public static class BitSetDuplicates {
		private BitSet values;
		private BitSet duplicates;

		public BitSetDuplicates(int N) {
			values = new BitSet(N);
			duplicates = new BitSet(N);
		}

		public void set(int index) {
			if (values.get(index)) {
				duplicates.set(index);
			} else {
				values.set(index);
			}
		}

		public int nextDuplicated(int fromIndex) {
			return duplicates.nextSetBit(fromIndex);
		}
	}

	public static Integer[] findDuplicates(int[] array) {
		BitSetDuplicates bv = new BitSetDuplicates(N + 1);
		for (int i : array) {
			bv.set(i);
		}
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		int fromIndex = 0;
		while (fromIndex >= 0) {
			fromIndex = bv.nextDuplicated(fromIndex);
			duplicates.add(fromIndex);
		}
		return duplicates.toArray(new Integer[duplicates.size()]);

	}
}
