/**
 * 
 */
package com.sb.leet.easy.math;

/**
 * @author ankur
 * @crated 30-Jun-2021
 * 
 *         https://leetcode.com/problems/reverse-integer/
 * 
 *         Assume the environment does not allow you to store 64-bit integers
 *         (signed or unsigned).
 * 
 *         Input: x = 123 Output: 321
 * 
 *         Input: x = -123 Output: -321
 * 
 *         Input: x = 120 Output: 21
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int reverse = reverse(0);
		System.out.println(reverse);
		// int a = Integer.MAX_VALUE;
		

	}

	private static int reverse(int i) {
		boolean neg = false;
		if (i < 0) {
			neg = true;
		}
		String str = Integer.toString(Math.abs(i));
		char[] arr = str.toCharArray();
		String reverse = "";
		int last = arr.length - 1;
		for (int j = last; j >= 0; j--) {
			if (j == last && arr[j] == '0') {
				continue;
			}
			reverse += arr[j];
		}
		reverse = neg ? "-" + reverse : reverse;
		int number = 0;
		try {
			number = Integer.parseInt(reverse);
		} catch (Exception e) {
			number = 0;
		}

		return number;

	}

}
