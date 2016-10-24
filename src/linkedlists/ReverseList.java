package linkedlists;

public class ReverseList {
	
	public static Node reverse(Node head){
		
		if (head.next == null)
			return head;
		
		Node runner = head; 
		Node reverseHead = null;
		
		while (runner != null){
			Node rest = runner.next; 
			runner.next = reverseHead;
			reverseHead = runner;
			runner = rest;
		}
		
		return reverseHead;
	}
	
	
	
	public static Node reverseRange(Node head, int n, int m){
		
		// Find the parent of Nth
		
		Node runner = head; 
		
		for(int i = 1; i < n ; i++ ){
			runner = runner.next;
		}
		
	
		// Extract the element Nth and create some variables for the reverse sublist
		
		Node headTail = runner; 
		runner = runner.next; 
		
		Node reverseHead = runner; 
		Node rest = runner.next; 
		Node reverseTail = runner;
		
		for(int i = n; i < m ; i++ ){
			rest = runner.next; 
			runner.next = reverseHead; 
			reverseHead = runner; 
			runner = rest; 
		}
		
		
		reverseTail.next = rest; 
		headTail.next = reverseHead; 
		
		return head;
		
	}

}
