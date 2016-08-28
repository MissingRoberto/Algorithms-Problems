package linkedlists;

public class Node {
	Node next = null; 
	int data; 
	
	public Node(int value){
		data = value; 
	}
	
	public void append(int value){
		Node end = new Node(value);
		Node n = this; 
		while (n.next != null){
			n = n.next; 
		}
		n.next = end; 
	}
	
	public boolean removeMiddle(){
		if (next == null)
			return false; 
		
		data = next.data;
		next = next.next; 
		next.next = null; 
				
		return true;
	}
	public Node partition(int pivot){
		Node leftEnd = null; 
	    Node rightHead = null; 
		Node n = this; 
		while (n != null){
			Node next = n.next; 
			n.next = null;		
			if (n.data < pivot){
				if (leftEnd != null)
					leftEnd.next = n; 
				leftEnd = n;		
			}else{
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
}
