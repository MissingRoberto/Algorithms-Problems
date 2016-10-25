package stacksnqueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnixPathTest {

	@Test
	public void testNoDots() {
		String path = "/dir1";
		assertEquals(path,UnixPath.simplifyPath(path));
	}
	
	
	@Test
	public void testDot() {
		String path = "/dir1/./dir2";
		String expected = "/dir1/dir2";
		assertEquals(expected,UnixPath.simplifyPath(path));
	}

	
	@Test
	public void testDoubleDot() {
		String path = "/dir1/dir2/./dir4/../dir3";
		String expected = "/dir1/dir2/dir3";
		assertEquals(expected,UnixPath.simplifyPath(path));
	}
}
