package treesngraphs;

public class BuildBinaryTree {

	public BinaryNode buildTree(int[] inorder, int[] postorder) {
		if (inorder.length == 0 || postorder.length == 0 || postorder.length != inorder.length)
			return null;
		return build(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
	}

	private int indexOf(int[] array, int start, int end, int value) {

		for (int i = start; i <= end; i++)
			if (array[i] == value)
				return i;
		return -1;

	}

	private BinaryNode build(int[] inorder, int[] postorder, int is, int ie, int ps, int pe) {

		if (ps > pe || is > ie) {
			return null;
		}

		int value = postorder[pe];
		BinaryNode current = new BinaryNode(value);

		int mid = indexOf(inorder, is, ie, value);

		current.right = build(inorder, postorder, mid + 1, ie, ps + mid - ie, pe - 1);
		current.left = build(inorder, postorder, is, mid - 1, ps, ps + mid - is - 1);

		return current;
	}

}
