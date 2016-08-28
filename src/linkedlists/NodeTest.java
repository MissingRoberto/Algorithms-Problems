package linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testAllLower() {
		Node list = new Node(3); 
		list.append(4);
		list.append(2);
		Node partitioned = list.partition(2);
		assertEquals(3,partitioned.data);
		assertEquals(4,partitioned.next.data);
        assertEquals(2,partitioned.next.next.data);
	}
	
	@Test
	public void testNormalCase() {
		Node list = new Node(3); 
		list.append(4);
		list.append(2);
		Node partitioned = list.partition(3);
		assertEquals(2,partitioned.data);
		assertEquals(3,partitioned.next.data);
        assertEquals(4,partitioned.next.next.data);
	}


}
