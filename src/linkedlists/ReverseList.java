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
		
		
		Node runner = head; 
		
		for(int i = 1; i < n ; i++ ){
			runner = runner.next;
		}
		
	
		Node headTail = runner; 
		System.out.println("Eliminate beginning. HeadTail: " + headTail.data);
		
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
