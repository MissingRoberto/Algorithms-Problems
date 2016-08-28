package arrays;


import static org.junit.Assert.*;

import org.junit.Test;

public class IsUniqueTest {

	@Test
	public void checkPositiveUniqueChars() {
	    assertTrue(IsUnique.isUniqueChars("abcdq"));
    }
	
	@Test
	public void checkNegativeUniqueChars() {
	    assertFalse(IsUnique.isUniqueChars("abcdqq"));
    }
	
	@Test
	public void checkPositiveUniqueCharsBits() {
	    assertTrue(IsUnique.isUniqueCharsBits("abcdq"));
    }
	@Test
	public void checkNegativeUniqueCharsBits() {
	    assertFalse(IsUnique.isUniqueCharsBits("abcdqq"));
    }
}
