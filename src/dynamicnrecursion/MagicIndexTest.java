package dynamicnrecursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class MagicIndexTest {

	@Test
	public void testUnique() {
		int[] array = {-1,-2,2};
		
		assertEquals(2,MagicIndex.findMagicIndex(array, 0, array.length-1));
		int[] array2 = {-1,-2,1,3,4,5,6};
		assertEquals(3,MagicIndex.findMagicIndex(array2, 0, array2.length-1));
		
		int[] array3 = {-1,-2,1,2,3,4,5};
		assertEquals(-1,MagicIndex.findMagicIndex(array3, 0, array3.length-1));
	}
	
	
	
	@Test
	public void testUniqueNotDistinct() {
		
		int[] array = {-10,-5,2,2,2,3,4,7,9,12,13};
		assertEquals(2,MagicIndex.findMagicIndexNotUnique(array, 0, array.length-1));
	
	}


}
