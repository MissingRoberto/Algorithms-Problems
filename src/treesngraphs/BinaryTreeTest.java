package treesngraphs;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void testAdd() {
		BinaryNode node = new BinaryNode(3);
		node.add(2);
		node.add(4);
		node.add(5);
		node.add(1);
		assertEquals(2,node.left.value);
		assertEquals(4,node.right.value);
		assertEquals(5,node.right.right.value);
		assertEquals(1,node.left.left.value);
	}
	
	
	@Test
	public void testRemoveNoChildren() {
		BinaryNode node = new BinaryNode(3);
		node.add(2);
		node.add(4);
		node.add(5);
		node.remove(5, node);
		assertEquals(2,node.left.value);
		assertEquals(4,node.right.value);
		assertEquals(null,node.right.right);
	}
	
	@Test
	public void testRemoveOneChildren() {
		BinaryNode node = new BinaryNode(3);
		node.add(2);
		node.add(4);
		node.add(5);
		node.remove(4, node);
		assertEquals(2,node.left.value);
		assertEquals(5,node.right.value);
		assertEquals(null,node.right.right);
	}
	
	@Test
	public void testRemoveRoot() {
		BinaryNode node = new BinaryNode(3);
		node.add(2);
		node.add(4);
		node.add(5);
		node.remove(3, node);
		assertEquals(4,node.value);
		assertEquals(2,node.left.value);
		assertEquals(5,node.right.value);
		assertEquals(null,node.right.right);
		assertEquals(null,node.right.left);
	}

	@Test
	public void testRemove2Children() {
		BinaryNode node = new BinaryNode(3);
		node.add(2);
		node.add(6);
		node.add(4);
		node.add(7);
		node.remove(6, node);
		assertEquals(3,node.value);
		assertEquals(2,node.left.value);
		assertEquals(7,node.right.value);
		assertEquals(null,node.right.right);
		assertEquals(4,node.right.left.value);
	}

	@Test
	public void testPostTraversal() {
		BinaryNode node = new BinaryNode(4);
		node.add(2);
		node.add(3);
		node.add(1);
		node.add(6);
		node.add(7);
		node.postTrasversalRecursive();
		node.postTrasversalIterative();
	}
}
