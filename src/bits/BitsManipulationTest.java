package bits;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitsManipulationTest {

	@Test
	public void testBasicBitOperations() {
		int n = 44;
		System.out.println("N: "+Integer.toBinaryString(n));
		System.out.println("Logic slide: "+Integer.toBinaryString(n>>3));
		System.out.println("Negation: "+Integer.toBinaryString(~n));
		System.out.println("N-1: "+Integer.toBinaryString(n-1));
		System.out.println("Clear fist bit: "+Integer.toBinaryString((n-1)&n));
		System.out.println("Clear a bit: "+Integer.toBinaryString(n & (~(1 << 3))));
		System.out.println("Mask a bit: "+Integer.toBinaryString( (n & (1 << 3))>> 3));
		System.out.println("Mask a interval: "+Integer.toBinaryString( (~0 + (1<<3)) << 5));
	}

}
