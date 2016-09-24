package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckOneWayTest {

	@Test
	public void checkEqual() {
	    assertTrue(CheckOneWay.checkOneWay("plain", "plain"));
    }
	
	@Test
	public void checkDiffenceSizes() {
		 assertFalse(CheckOneWay.checkOneWay("plain", "plained"));
    }
	
	@Test
	public void checkWithDeletion() {
		assertTrue(CheckOneWay.checkOneWay("plain", "plaibn"));
    }
	
	@Test
	public void checkWithDeletionEnd() {
		assertTrue(CheckOneWay.checkOneWay("plain", "plai"));
    }
	
	@Test
	public void checkWithInsertion() {
		assertTrue(CheckOneWay.checkOneWay("plain", "plan"));
    }
	@Test
	public void checkWithInsertionAtEnd() {
		assertTrue(CheckOneWay.checkOneWay("plain", "plai"));
    }

	@Test
	public void checkWithReplacement() {
		assertTrue(CheckOneWay.checkOneWay("plain", "plabn"));
    }
}
