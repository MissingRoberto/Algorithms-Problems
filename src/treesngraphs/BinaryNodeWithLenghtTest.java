package treesngraphs;

import static org.junit.Assert.*;
import org.junit.Test;


public class BinaryNodeWithLenghtTest {


	@Test
	public void testListOfDepths() {
		BinaryNodeWithLenght node = new BinaryNodeWithLenght(5);
		assertTrue(node.checkBalance());
		node.add(2);
		assertTrue(node.checkBalance());
		node.add(7);
		assertTrue(node.checkBalance());
		node.add(8);
		assertTrue(node.checkBalance());
		node.add(9);
		assertFalse(node.checkBalance());
		node.add(6);
		assertFalse(node.checkBalance());
		node.add(1);
		assertTrue(node.checkBalance());
		node.add(3);
		assertTrue(node.checkBalance());
		
	}

}
