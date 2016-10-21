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
		System.out.println("Post-order traversal recursive: ");
		node.postTrasversalRecursive();
		System.out.println("");
		System.out.println("Post-order traversal iterative: ");
		node.postTrasversalIterative();
		System.out.println("");
	}
	
	@Test
	public void testPreTraversal() {
		BinaryNode node = new BinaryNode(4);
		node.add(2);
		node.add(3);
		node.add(1);
		node.add(6);
		node.add(7);
		
		System.out.println("Pre-order traversal recursive: ");
		node.preOrderTraversalRecursive();
		System.out.println("");
		System.out.println("Pre-order traversal iterative: ");
		node.preOrderTraversalIterative();
		System.out.println("");
	}
	
	
	@Test
	public void testInOrderTraversal() {
		BinaryNode node = new BinaryNode(4);
		node.add(2);
		node.add(3);
		node.add(1);
		node.add(6);
		node.add(7);
		
		System.out.println("In-order traversal recursive: ");
		node.inOrderTraversalRecursive();
		System.out.println("");
		System.out.println("In-order traversal iterative: ");
		node.inOrderTraversalIterative();
		System.out.println("");
	}
	
	
	@Test
	public void testAncestor() {
		BinaryNode root= new BinaryNode(4);
		root.add(2);
		root.add(3);
		root.add(1);
		root.add(6);
		root.add(7);
		
		assertNull(root.findAncestor(8, 9));
		assertEquals(6,root.findAncestor(6, 7).value);
		assertEquals(4,root.findAncestor(1, 7).value);
		assertEquals(2,root.findAncestor(1, 3).value);
		assertNull(root.findAncestor(6, 8));
	}
	
	
	@Test
	public void testFindClosest() {
		BinaryNode root= new BinaryNode(4);
		root.add(2);
		root.add(3);
		root.add(1);
		root.add(6);
		root.add(7);
		
		assertEquals(6,root.findClosest(6));
		assertEquals(1,root.findClosest(1));
		assertEquals(3,root.findClosest(3));
		assertEquals(7,root.findClosest(8));
		assertEquals(1,root.findClosest(0));
		assertEquals(6,root.findClosest(5));
		
	}
}
