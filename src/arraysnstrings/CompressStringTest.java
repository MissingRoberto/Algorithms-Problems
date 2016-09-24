package arraysnstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompressStringTest {

	@Test
	public void checkEmpty() {
	    assertEquals("",CompressString.compress(""));
    }
	
	@Test
	public void checkCompress() {
	    assertEquals("a4",CompressString.compress("aaaa"));
    }
	
	@Test
	public void checkNotCompress() {
	    assertEquals("abcd",CompressString.compress("abcd"));
    }
	
	
	@Test
	public void checkNormalCase() {
	    assertEquals("a2b1c4d2",CompressString.compress("aabccccdd"));
    }
}
