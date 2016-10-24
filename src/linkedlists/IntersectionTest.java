package linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntersectionTest {

	@Test
	public void testIntersection() {
		Node node1 = new Node(1);
		node1.append(2);
		node1.append(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		
		node4.next = node1; 
		node5.next = node6; 
		node6.next = node1; 
		
		assertEquals(node1,Intersection.getIntersection(node4, node5));
		
	}

}
