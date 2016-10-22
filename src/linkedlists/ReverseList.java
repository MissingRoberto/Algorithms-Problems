package linkedlists;

public class ReverseList {
	
	public static Node reverse(Node head){
		
		if (head.next == null)
			return head;
		
		
		Node runner = head; 
		Node reverseHead = null;
		
		while (runner != null){
			System.out.println("Runner:" + runner.data);
			Node rest = runner.next; 
			runner.next = reverseHead;
			reverseHead = runner;
			runner = rest;
		}
		
		return reverseHead;
	}

}
