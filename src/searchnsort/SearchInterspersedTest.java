package searchnsort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchInterspersedTest {

	@Test
	public void testEmpty() {
		String[] array = new String[] {};
		assertEquals(-1, SearchInterspersed.find(array, "hola"));

	}

	@Test
	public void testNoBlanks() {
		String[] array = new String[] { "adios", "hola", "mierda", "kaka" };
		assertEquals(1, SearchInterspersed.find(array, "hola"));

	}

	@Test
	public void testWithBlanks() {
		String[] array = new String[] { "adios", "", "", "hola", "", "", "mierda", "", "", "", "" };
		assertEquals(3, SearchInterspersed.find(array, "hola"));

	}
	
	
	@Test
	public void testNotFoundBlanks() {
		String[] array = new String[] { "adios", "", "", "hola", "", "", "mierda", "", "", "", "" };
		assertEquals(-1, SearchInterspersed.find(array, "notfound"));

	}

}
