/**
 * 
 */
package com.sb.leet.easy.recursion;

/**
 * @author ankur
 * @crated 20-Jul-2021
 * 
 *         https://leetcode.com/problems/power-of-two/
 * 
 *         https://leetcode.com/problems/power-of-three/
 * 
 *         An integer n is a power of two, if there exists an integer x such
 *         that n == 2x.
 * 
 *         Input: n = 1 Output: true Explanation: 20 = 1
 * 
 *         Input: n = 16 Output: true Explanation: 24 = 16
 * 
 *         Input: n = 3 Output: false
 * 
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 9;
		System.out.println(isPowerOfTwo(n));

	}

	/**
	 * For power of 3 replace 2 with 3 in below code.
	 * 
	 * @param n
	 * @return boolean
	 */
	private static boolean isPowerOfTwo(int n) {
		// base condition.
		if (n == 2 || n == 1) {
			return true;
		} else if (n > 2 && n % 2 == 0) {
			return isPowerOfTwo(n / 2);
		} else {
			return false;
		}

	}

}
