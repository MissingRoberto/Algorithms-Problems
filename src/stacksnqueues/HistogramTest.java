package stacksnqueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class HistogramTest {

//	@Test
//	public void testExample() {
//		assertEquals(12,Histogram.findArea(new int[]{6,2,5,4,5,1,6}));
//	}
//	
	
	@Test
	public void testMinimum() {
		int[] array =new int[]{6,2,4,3,4,1,1,1,1,1,1};
 		assertEquals(array.length,Histogram.findArea(array));
	}

}
