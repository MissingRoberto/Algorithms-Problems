package searchnsort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

	@Test
	public void testSearchSortedNRotated() {

		
		int[] array = {10,13,14,15,17,1,2};
		
		for(int i = 0; i< array.length;i++){
			assertEquals(i,Search.searchSortedNRotated(array,array[i]));
		}
	}

}
