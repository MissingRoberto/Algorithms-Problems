package linkedlists;

public class GetDistinct {

	public static Node getDistinct(Node head) {
		Node previous = null;
		Node distinctHead = new Node(-1);
		Node distinctTail = distinctHead;
		Node runner = head;
		boolean isUnique = true;

		while (runner != null) {
			if (previous != null) {
				if (previous.data != runner.data) {
					if (isUnique) {
						distinctTail.next = previous;
						distinctTail = distinctTail.next;
					}

					isUnique = true;
				} else {
					isUnique = false;
				}
			}
			previous = runner;
			runner = runner.next;
		}

		if (isUnique) {
			distinctTail.next = previous;
			distinctTail = distinctTail.next;
		}
		distinctTail.next = null;
		return distinctHead.next;
	}

}
