package stacksnqueues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import treesngraphs.BinaryNode;

public class ZigZap {

	public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(BinaryNode root) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		Queue<BinaryNode> nextLevel = new LinkedList<BinaryNode>();
		ArrayList<Integer> level = new ArrayList<Integer>();

		queue.offer(root);

		while (!queue.isEmpty()) {

			BinaryNode current = queue.poll();

			if (res.size() % 2 != 0)
				level.add(current.value);
			else {
				level.add(0, current.value);
			}

			if (current.left != null)
				nextLevel.offer(current.left);
			if (current.right != null)
				nextLevel.offer(current.right);

			if (queue.isEmpty()) {
				res.add(level);
				level = new ArrayList<Integer>();
				queue = nextLevel;
				nextLevel = new LinkedList<BinaryNode>();
			}

		}

		return res;
	}

}
