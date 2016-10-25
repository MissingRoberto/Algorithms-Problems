package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberTest {


	@Test
	public void checkNormal() {
	    assertEquals(18, RomanNumber.toInt("XVIII"));
    }
	
	@Test
	public void checkSubstraction() {
		assertEquals(14, RomanNumber.toInt("XIV"));
	}

	@Test
	public void checkSubstraction2() {
		assertEquals(13, RomanNumber.toInt("XIIV"));
	}

	@Test
	public void checkSubstraction3() {
		assertEquals(90, RomanNumber.toInt("XC"));
	}

}
