package treesngraphs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrieNodeTest {
	
	@Test
	public void testInsert() {
		TrieNode root = new TrieNode();
		root.add("hi");
		assertTrue(root.hasChild('h'));
		assertTrue(root.getChild('h').hasChild('i'));	
		assertTrue(root.contains("hi"));	
		root.add("himalaya");
		assertTrue(root.contains("himalaya"));	
		assertFalse(root.contains("hima"));	
		assertFalse(root.contains("hola"));	
		assertTrue(root.startsWith("hima"));
		assertFalse(root.startsWith("ho"));
		assertTrue(root.startsWith("hi"));
		
	}

}
