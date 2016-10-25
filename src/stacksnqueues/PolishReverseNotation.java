package stacksnqueues;

public class PolishReverseNotation {

	public static int calculate(char[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for (char token : tokens) {
			switch (token) {
			case '+':
				stack.push(stack.pop() + stack.pop());
				break;
			case '-':
				stack.push(stack.pop() - stack.pop());
				break;
			case '*':
				stack.push(stack.pop() * stack.pop());
				break;
			case '/':
				stack.push(stack.pop() / stack.pop());
				break;
			default:
				stack.push(Character.getNumericValue(token));
			}

		}
		return !stack.isEmpty() ? stack.pop() : 0;

	}
}
