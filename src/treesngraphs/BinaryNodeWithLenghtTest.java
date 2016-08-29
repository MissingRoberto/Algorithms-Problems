package treesngraphs;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import linkedlists.Node;

public class BinaryNodeWithLenghtTest {


	@Test
	public void testListOfDepths() {
		BinaryNodeWithLenght node = new BinaryNodeWithLenght(2);
		assertTrue(node.checkBalance());
		node.add(1);
		assertTrue(node.checkBalance());
		node.add(7);
		assertTrue(node.checkBalance());
		node.add(8);
		assertTrue(node.checkBalance());
		node.add(9);
		assertFalse(node.checkBalance());
		node.add(10);
		assertFalse(node.checkBalance());
		
	}

}
