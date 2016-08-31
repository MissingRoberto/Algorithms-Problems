package dynamicnrecursion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PowerSetTest {

	@Test
	public void test() {
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		PowerSet.powerSet(set);
		set.add(2);
		System.out.println("\nSubset 2\n");
		PowerSet.powerSet(set);
		set.add(3);
		System.out.println("\nSubset 3\n");
		PowerSet.powerSet(set);		
		set.add(4);
		System.out.println("\nSubset 4\n");
		PowerSet.powerSet(set);
	
	}

}
