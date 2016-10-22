package linkedlists;

public class DeleteValue {
	public static Node deleteByValue(Node head, int value) {

		Node newHead = head;

		// Eliminates matches at the beginning

		while (newHead != null && newHead.data == value) {
			newHead = newHead.next;
		}

		// Eliminates matches in the rest of the list

		Node runner = newHead;
		Node previous = newHead;

		while (runner != null) {
			if (runner.data == value){
				previous.next = runner.next;
			}else{
				previous = runner;
			}
			runner = runner.next;
		}

		return newHead;
	}
}
