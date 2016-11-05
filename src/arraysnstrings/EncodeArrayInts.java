package arraysnstrings;

public class EncodeArrayInts {

	private static boolean isValidCode(int i, int j) {
		return !(i * 10 + j > 26);
	}

	public static int combinations(int[] message) {
		return calculateCombinations(message, message.length - 1);
	}

	private static int calculateCombinations(int[] message, int i) {
		if (i < 0) {
			return 0;
		}

		if (i < 2) {
			return i + 1;
		}

		int combinations = calculateCombinations(message, i - 1);
		if (isValidCode(message[i - 1], message[i]))
			combinations += calculateCombinations(message, i - 2);
		return combinations;
	}
}
