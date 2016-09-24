package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckRotationTest {

	@Test
	public void checkEqual() {
	    assertTrue(CheckRotation.isRotation("plain", "plain"));
    }
	
	@Test
	public void checkDifferentSize() {
	    assertFalse(CheckRotation.isRotation("plain", "plained"));
    }
	
	@Test
	public void checkNormalCase() {
	    assertTrue(CheckRotation.isRotation("plain", "inpla"));
    }
	
	@Test
	public void checkNegative() {
	    assertFalse(CheckRotation.isRotation("plain", "inplaa"));
    }
	
	@Test
	public void checkEmpty() {
	    assertTrue(CheckRotation.isRotation("", ""));
    }

}
