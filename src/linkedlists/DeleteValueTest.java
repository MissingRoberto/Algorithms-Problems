package linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteValueTest {

	@Test
	public void testDeleteByValue() {
		Node head = new Node(4); 
		head.append(4);
		head.append(4);
		head.append(0);
		head.append(4);
		head.append(4);
		head.append(1);
		head.append(2);
		head.append(4);
		head.append(4);
		
		Node runner = DeleteValue.deleteByValue(head,4);
		runner.print();
		int i = 0;
		
		while (runner != null){
			assertEquals(i, runner.data);
			runner = runner.next;
			i++;
		}
		
		
	}

}
