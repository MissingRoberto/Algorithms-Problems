package arraysnstrings;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PairsTest {

	@Test
	public void test() {
		int[] array =  new int[]{1, 4, 45, 6,10, -8};
		
		ArrayList<Pair> expected = new ArrayList<Pair>();
		expected.add(new Pair(6,10));
		assertEquals(expected,Pair.findPairs(array, 16)); 
		array =  new int[]{1, 4, 45, 6,6,10, -8};
		expected.add(new Pair(6,10));
		assertEquals(expected,Pair.findPairs(array, 16)); 
	}
	
	@Test
	public void testEmpty() {
		int[] array =  new int[]{1, 4, 45, 6,10, -8};
		assertEquals(0,Pair.findPairs(array, 17).size()); 
	}

}
