package treesngraphs;

import static org.junit.Assert.*;
import java.util.ArrayList;
import linkedlists.Node;

import org.junit.Test;

public class ListOfDepthsTest {

	@Test
	public void testListOfDepths() {
		BinaryNode node = new BinaryNode(2);
		node.add(1);
		node.add(6);
		node.add(4);
		node.add(7);
		
		int[] level0 = {2};
		int[] level1 = {1,6};
		int[] level2 = {4,7};
		int[][] expected = {level0,level1,level2};
		
		ArrayList<Node> list = ListOfDepths.listOfDepths(node);
		
		assertEquals(expected.length,list.size());
		
		for(int i=0; i<expected.length; i++){
			Node n = list.get(i);	
			assertEquals(expected[i].length,n.size());
			for(int j=0; j<expected[i].length; j++){
				assertEquals(expected[i][j],n.data);
				n = n.next;
			}
		}
	}

}
