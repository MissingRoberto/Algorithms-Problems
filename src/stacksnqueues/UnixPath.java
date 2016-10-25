package stacksnqueues;

public class UnixPath {

	public static String simplifyPath(String path) {
		Stack<String> stack = new Stack<String>();
		for (String folder : path.split("/")) {

			if (folder.equals("..") && !stack.isEmpty()) {
				stack.pop();
			} else if (!folder.equals(".") && !folder.equals("")) {
				stack.push(folder);
			}
		}

		String result = "";

		while (!stack.isEmpty())
			result = "/" + stack.pop() + result;

		return result;
	}

}
