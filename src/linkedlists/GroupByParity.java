package linkedlists;

public class GroupByParity {

	public static Node groupByParity(Node head) {
		if (head.next == null)
			return head;

		Node evenHead = head;
		Node evenTail = head;
		Node oddTail = head.next;
		Node oddHead = head.next;

		Node runner = oddTail.next;
		boolean isOdd = false;

		while (runner != null) {
			if (isOdd) {
				oddTail.next = runner;
				oddTail = runner;
			} else {
				evenTail.next = runner;
				evenTail = runner;
			}
			runner = runner.next;
			isOdd = !isOdd;
		}

		oddTail.next = evenHead;
		return oddHead;
	}

}
