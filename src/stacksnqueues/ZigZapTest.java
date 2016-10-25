package stacksnqueues;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import treesngraphs.BinaryNode;

public class ZigZapTest {

	@Test
	public void test() {
		BinaryNode node = new BinaryNode(4);
		node.add(2);
		node.add(1);
		node.add(3);
		node.add(6);
		node.add(5);
		ArrayList<ArrayList<Integer>> levels = ZigZap.zigzagLevelOrder(node);
		assertEquals(3,levels.size());
		assertEquals(1,levels.get(0).size());
		System.out.println(levels.get(0).toString());
		assertEquals(2,levels.get(1).size());
		System.out.println(levels.get(1).toString());
		assertEquals(3,levels.get(2).size());
		System.out.println(levels.get(2).toString());
	}

}
