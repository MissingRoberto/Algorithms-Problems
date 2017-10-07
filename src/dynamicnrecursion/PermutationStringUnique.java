package dynamicnrecursion;

import java.util.ArrayList;

public class PermutationStringUnique {

	public static String[] permutation(String s) {
		if (s.isEmpty())
			return new String[] {};

		if (s.length() == 1)
			return new String[] { s };

		char c = s.charAt(s.length() - 1);

		s = s.substring(0, s.length() - 1);
		String[] subPermutations = permutation(s);

		ArrayList<String> permutations = new ArrayList<String>();

		for (String permutation : subPermutations) {
			for (int i = 0; i <= permutation.length();i++) {
				StringBuilder sb = new StringBuilder(permutation);
				permutations.add(sb.insert(i, c).toString());
			}
		}

		return (String[]) permutations.toArray(new String[permutations.size()]);
	}
}
