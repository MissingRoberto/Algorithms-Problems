package linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveNthTest {

	@Test
	public void testRemoveNth() {
		Node head = new Node(0); 
		head.append(1);
		head.append(5);
		head.append(2);
	
		Node result = RemoveNth.removeNth(head,1);
		int i = 0;
		
		while (result != null){
			assertEquals(i, result.data);
			result = result.next;
			i++;
		}
		assertEquals(3,i);
	}
	
	
	@Test
	public void testNoRemove() {
		Node head = new Node(0); 
		head.append(1);
		head.append(2);
	
		Node result = RemoveNth.removeNth(head,4);
		int i = 0;
		
		while (result != null){
			assertEquals(i, result.data);
			result = result.next;
			i++;
		}
		assertEquals(3,i);
	}
	
	
	@Test
	public void testRemoveTail() {
		Node head = new Node(0); 
		head.append(1);
		head.append(2);
	
		Node result = RemoveNth.removeNth(head,0);
		
		int i = 0;
		
		while (result != null){
			assertEquals(i, result.data);
			result = result.next;
			i++;
		}
		assertEquals(2,i);
	}
	
	
	@Test
	public void testRemoveHead() {
		Node head = new Node(5); 
		head.append(0);
		head.append(1);
		head.append(2);
	
		Node result = RemoveNth.removeNth(head,3);

		int i = 0;
		
		while (result != null){
			assertEquals(i, result.data);
			result = result.next;
			i++;
		}
		assertEquals(3,i);
	}
}
