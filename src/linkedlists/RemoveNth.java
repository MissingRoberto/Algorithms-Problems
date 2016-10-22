package linkedlists;

public class RemoveNth {

	public static Node removeNth(Node head, int n) {

		if (n < 0) {
			return head;
		}

		Node nthParent = head;
		Node end = head;

		// Move forward end n positions; Return if that element doesn't exist.

		for (int i = 0; i < n; i++) {

			if (end.next != null)
				end = end.next;
			else
				return head;
		}

		// Special case. Remove the head

		if (end.next == null) 
			return head.next;

		end = end.next;

		// Iterate until last element
		while (end.next != null) {
			nthParent = nthParent.next;
			end = end.next;
		}

		nthParent.next = nthParent.next.next;

		return head;
	}

}
