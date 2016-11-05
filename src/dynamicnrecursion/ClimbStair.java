package dynamicnrecursion;

public class ClimbStair {

	public static int climbWaysRecursive(int steps) {
		if (steps < 0)
			return -1;

		if (steps <= 2)
			return steps;
		return climbWaysRecursive(steps - 1) + climbWaysRecursive(steps - 2);
	}

	public static int climbWaysIterative(int steps) {
		if (steps < 0)
			return -1;
		if (steps <= 2) {
			return steps;
		}

		steps -= 2;

		int previous = 2;
		int beforePrevious = 1;
		while (steps != 0) {
			int ways = previous + beforePrevious;
			beforePrevious = previous;
			previous = ways;
			steps--;
		}
		return previous;
	}

}
