package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberTest {


	@Test
	public void checkNormal() {
	    assertEquals(18, RomanNumber.convert("XVIII"));
    }
	
	@Test
	public void checkSubstraction() {
	    assertEquals(14, RomanNumber.convert("XIV"));
    }
	

	@Test
	public void checkSubstraction2() {
	    assertEquals(13, RomanNumber.convert("XIIV"));
    }
	
	@Test
	public void checkSubstraction3() {
	    assertEquals(90, RomanNumber.convert("XC"));
    }

}
