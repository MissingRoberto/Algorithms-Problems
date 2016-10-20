package arraysnstrings;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FindElementKTest {

	@Test
	public void test() {
		
		int[] array = new int[]{-10,2,20,21,5,-88};
		int[] sorted = new int[]{-88,-10,2,5,20,21};
		
		for(int i = 0;i< sorted.length;i++ ){
			assertEquals(sorted[i], FindElementK.findElement(array, i+1));
		}

	}
	

}
