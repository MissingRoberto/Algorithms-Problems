package stacksnqueues;

public class VerifyPreOrder {
	public static boolean verifyPreOrder(int[] preorder) {
		if (preorder.length == 0)
			return false;

		Stack<Integer> stack = new Stack<Integer>();

		int low = Integer.MIN_VALUE;
		for (int t : preorder) {
			if (t < low)
				return false;

			while (!stack.isEmpty() && t > stack.peek())
				low = stack.pop();

			stack.push(t);
		}

		return true;
	}
}
