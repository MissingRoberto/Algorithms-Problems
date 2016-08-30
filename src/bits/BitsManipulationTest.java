package bits;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitsManipulationTest {

	@Test
	public void test() {
		assertEquals(8,BitsManipulation.flip2Win(1775));
	}

}
