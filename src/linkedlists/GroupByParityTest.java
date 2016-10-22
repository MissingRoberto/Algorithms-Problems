package linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class GroupByParityTest {

	@Test
	public void testByParity() {
		Node head = new Node(2); 
		head.append(0);
		head.append(3);
		head.append(1);
		head.append(4);
		
		Node runner = GroupByParity.groupByParity(head);
		int i = 0;
		
		while (runner != null){
			assertEquals(i, runner.data);
			runner = runner.next;
			i++;
		}
		
	}

}
