package stacksnqueues;

public class Histogram {

	public static int findArea(int[] histogram) {

		Stack<Integer> stack = new Stack<Integer>();

		int max_area = 0;
		int i = 0;
		while (i < histogram.length) {
			if (stack.isEmpty() || histogram[i] >= histogram[stack.peek()]) {
				stack.push(i++);
			} else {
				int tp = stack.pop();
				max_area = Math.max(max_area, histogram[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1));

			}

		}

		while (!stack.isEmpty()) {
			int tp = stack.pop();
			max_area = Math.max(max_area, histogram[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1));
		}

		return max_area;
	}

}
