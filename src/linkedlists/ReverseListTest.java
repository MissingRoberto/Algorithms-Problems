package linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseListTest {

	@Test
	public void testRemoveHead() {
		Node head = new Node(2); 
		head.append(1);
		head.append(0);
	
		Node result = ReverseList.reverse(head);

		int i = 0;
		
		while (result != null){
			assertEquals(i, result.data);
			result = result.next;
			i++;
		}
		
		assertEquals(3,i);
	}
	
	
	
	@Test
	public void testReverseRange() {
		Node head = new Node(0); 
		head.append(1);
		head.append(2);
		head.append(5);
		head.append(4);
		head.append(3);
	
		Node result = ReverseList.reverseRange(head,3,6);
		result.print();
		
		int i = 0;
		
		while (result != null){
			assertEquals(i, result.data);
			result = result.next;
			i++;
		}
		
		assertEquals(6,i);
	}

}
