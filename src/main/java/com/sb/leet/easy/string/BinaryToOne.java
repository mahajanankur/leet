/**
 * 
 */
package com.sb.leet.easy.string;

import java.math.BigInteger;

/**
 * @author ankur
 * @crated 10-Sep-2021
 * 
 *         https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
 */
public class BinaryToOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String s = "1111011110000011100000110001011011110010111001010111110001";
		String s = "1111110011101010110011100100101110010100101110111010111110110010";
		// String s = "1101";
		int ops = numStepsBigByCarry(s);
		System.out.println(ops);

	}

	public static int numSteps(String s) {
		int ops = 0;
		long decimal = Long.parseLong(s, 2);
		if (decimal == 0) {
			return ops;
		}
		while (decimal > 1) {
			if (decimal % 2 == 0) {
				decimal = decimal / 2;
			} else {
				decimal = decimal + 1;
			}
			ops++;
		}
		return ops;
	}

	public static int numStepsBigInt(String s) {
		int ops = 0;
		BigInteger decimal = new BigInteger(s, 2);
		if (decimal.equals(BigInteger.ZERO)) {
			return ops;
		}
		while (decimal.compareTo(BigInteger.ONE) > -1) {
			if (decimal.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
				decimal = decimal.divide(BigInteger.TWO);
			} else {
				decimal = decimal.add(BigInteger.ONE);
			}
			ops++;
		}
		return ops;
	}

	public static int numStepsBigByCarry(String s) {
		int ops = 0;
		int car = 0;
		int zeroAsci = 48;
		for (int i = s.length() - 1; i > 0; i--) {
			if (s.charAt(i) - zeroAsci + car == 1) {
				car = 1;
				ops += 2;
			} else {
				ops += 1;
			}
		}
		ops = ops + car;
		return ops;
	}

}
