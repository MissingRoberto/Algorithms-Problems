package stacksnqueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testStack() {
		Stack<String> stack = new Stack<String>();
		assertTrue(stack.isEmpty());
		stack.push("hi");
		stack.push("bye");
		stack.push("good morning");
		assertEquals("good morning",stack.pop());
		assertEquals("bye",stack.pop());
		assertEquals("hi",stack.pop());
		assertTrue(stack.isEmpty());
	}
	
	
	@Test
	public void testSetOfStacksBigHeight() {
		SetOfStacks<String> stack = new SetOfStacks<String>(10);
		assertTrue(stack.isEmpty());
		stack.push("hi");
		stack.push("bye");
		stack.push("good morning");
		assertEquals("good morning",stack.pop());
		assertEquals("bye",stack.pop());
		assertEquals("hi",stack.pop());
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testSetOfStacks() {
		SetOfStacks<String> stack = new SetOfStacks<String>(1);
		assertTrue(stack.isEmpty());
		stack.push("hi");
		stack.push("bye");
		stack.push("good morning");
		assertEquals("good morning",stack.pop());
		assertEquals("bye",stack.pop());
		assertEquals("hi",stack.pop());
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testSetOfStacksPopAt() {
		SetOfStacks<String> stack = new SetOfStacks<String>(1);
		assertTrue(stack.isEmpty());
		stack.push("hi");
		stack.push("bye");
		stack.push("good morning");
		assertEquals("bye",stack.popAt(1));
		assertEquals("good morning",stack.pop());
		assertEquals("hi",stack.pop());
		assertTrue(stack.isEmpty());
	}

}
