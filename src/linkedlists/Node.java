package linkedlists;

import static org.junit.Assert.assertEquals;

public class Node {
	public Node next = null;
	public int data;

	public Node(int value) {
		data = value;
	}

	public int size() {
		if (next == null) {
			return 1;
		}
		return next.size() + 1;
	}

	public void append(int value) {
		Node end = new Node(value);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	public boolean removeMiddle() {
		if (next == null)
			return false;

		data = next.data;
		next = next.next;
		next.next = null;

		return true;
	}

	public Node partition(int pivot) {
		Node leftEnd = null;
		Node rightHead = null;
		Node n = this;
		while (n != null) {
			Node next = n.next;
			n.next = null;
			if (n.data < pivot) {
				if (leftEnd != null)
					leftEnd.next = n;
				leftEnd = n;
			} else {
				if (rightHead != null)
					rightHead.append(n.data);
				else
					rightHead = n;
			}
			n = next;
		}

		if (leftEnd != null)
			leftEnd.next = rightHead;
		else
			leftEnd = rightHead;
		return leftEnd;
	}

	public void removeDuplicated() {
		Node runner = next;
		Node previous = this;
		while (runner != null) {
			if (runner.data == previous.data) {
				previous.next = runner.next;
				runner = previous.next;
			} else {
				previous = runner; 
				runner = runner.next;
			}
		}
	}

	public void print() {
		Node runner = this;
		System.out.print("[");
		while (runner != null) {
			System.out.print(" " + runner.data);
			runner = runner.next;
		}
		System.out.println("]");
	}
	
	
	private Node advanceTwice(){
		if ( next == null)
			return null;
		else
			return next.next;
	}

	// Use to pointers and double the second 
	public Node findMiddle(){
		Node middle = this; 
		Node end = this.advanceTwice();
		while (end != null){
			middle = middle.next; 
			end = end.advanceTwice(); 
		}
		return middle; 
	}
	

	/* 1. Find the middle of the list
	*  2. Reverse Half the array
	*  3. Compare the two pieces.
	*/


	public boolean isPalindrome(){
		if ( next == null)
			return true; 
		Node firstHalf = this; 
		Node middle= findMiddle(); 
		Node secondHalf = ReverseList.reverse(middle.next); 
		
		while(secondHalf != null ){
			if (firstHalf.data != secondHalf.data )
				return false;
			firstHalf = firstHalf.next; 
			secondHalf = secondHalf.next;
		}
		return true; 
	}
	
	

}
