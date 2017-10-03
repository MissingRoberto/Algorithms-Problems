package javabasics;

import java.math.BigInteger;
import java.util.Scanner;

public class BigDecimal {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String s1, s2;
		s1 = input.nextLine();
		s2 = input.nextLine();
		input.close();
		System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
		System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));
	}
}
