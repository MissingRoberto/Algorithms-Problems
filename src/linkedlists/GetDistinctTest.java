package linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetDistinctTest {

	@Test
	public void testGetDistinct() {
		Node head = new Node(0); 
		head.append(0);
		head.append(0);
		head.append(1);
		head.append(1);
		head.append(2);
		head.append(3);
		head.append(3);
		head.append(3);
		head.append(4);
		
		Node result = GetDistinct.getDistinct(head);
		assertEquals(2, result.data);
		assertEquals(4, result.next.data);
		assertNull(result.next.next);
			
	}
	
	@Test
	public void testNoDistinct() {
		Node head = new Node(0); 
		head.append(0);
		head.append(0);
		head.append(1);
		head.append(1);
		head.append(2);
		head.append(2);
		head.append(3);
		head.append(3);
		head.append(3);
		
		Node result = GetDistinct.getDistinct(head);
		assertNull(result);
			
	}

}
