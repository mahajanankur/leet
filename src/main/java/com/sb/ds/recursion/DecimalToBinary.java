/**
 * 
 */
package com.sb.ds.recursion;

/**
 * @author ankur
 * @crated 20-Jul-2021
 * 
 *         n = 10 -> 10/2 = 5 rem = 0, 5/2 = 2 rem = 1, 2/2 = 1 rem = 0, 1/2 = 0
 *         rem = 1
 * 
 *         Binary is all reminders from last = 1010
 */
public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String binary = toBinary(10, "");
		System.out.println(binary);
	}

	private static String toBinary(int n, String binary) {
		// Base case.
		if (n == 0) {
			return binary;
		}
		// Recursive case.
		binary = n % 2 + binary;
		return toBinary(n / 2, binary);
	}
}
