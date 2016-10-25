package arraysnstrings;

public class RomanNumber {

	public static int convert(String roman) {

		int total = 0;
		int sum = 0;
		int previous = 0;
		for (int i = 0; i < roman.length(); i++) {
			int number = findNumber(roman.charAt(i));
			if (number < 0) {
				return -1;
			}
			if (previous == number) {
				sum += number;
			} else if (previous < number) {
				total -= sum;
				sum = number;
			} else {
				total += sum;
				sum = number;
			}
			previous = number;
		}

		total += sum;

		return total;
	}

	public static int toInt(String roman) {
		int sum = 0;
		StringBuilder sb = new StringBuilder(roman);
		int previous = -1;

		while (sb.length() > 0) {
			int n = findNumber(sb.charAt(sb.length() - 1));

			if (n >= previous) {
				previous = n;
				sum += n;
			} else {
				sum -= n;
			}
			sb.deleteCharAt(sb.length() - 1);
		}
		return sum;
	}

	public static int findNumber(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;

		}
	}
}
