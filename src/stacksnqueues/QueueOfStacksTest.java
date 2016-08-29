package stacksnqueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueOfStacksTest {

	@Test
	public void testBasic() {
		QueueOfStacks<String> queue = new QueueOfStacks<String>();
		queue.push("1");
		queue.push("2");
		queue.push("3");
		
		assertTrue(queue.isEmpty());
		assertEquals("1",queue.pop());
		assertEquals("2",queue.pop());
		assertEquals("3",queue.pop());
		assertTrue(queue.isEmpty());
	}

	
	@Test
	public void testIntermidiateInsertions() {
		QueueOfStacks<String> queue = new QueueOfStacks<String>();
		queue.push("1");
		queue.push("2");
		queue.push("3");
		assertTrue(queue.isEmpty());
		assertEquals("1",queue.pop());
		queue.push("4");
		assertEquals("2",queue.pop());
		assertEquals("3",queue.pop());
		assertEquals("4",queue.pop());
		assertTrue(queue.isEmpty());
	}
}
