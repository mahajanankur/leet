/**
 * 
 */
package com.sb.leet.easy.math;

/**
 * @author ankur
 * @crated 02-July-2021
 * 
 *         https://leetcode.com/problems/palindrome-number/
 * 
 *         An integer is a palindrome when it reads the same backward as
 *         forward. For example, 121 is palindrome while 123 is not.
 * 
 *         Input: x = 123 Output: false
 * 
 *         Input: x = -121 Output: false
 * 
 *         Input: x = 121 Output: true
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// boolean flag = isPalindromeByStringArr(12321);
		boolean flag = isPalindromeByString(-12321);
		System.out.println(flag);
	}

	public static boolean isPalindromeByStringArr(int x) {
		boolean isPalindrome = true;
		String str = Integer.toString(x);
		char[] arr = str.toCharArray();
		// 1 3 2 1 2 3 1
		// 0 1 2 3 4 5 6
		// length = 6
		// i =0 if i == length - 1 -i (0 = 5, 1=4, 2=3, 3=2)
		// length = 7
		// i =0 if i == length(7) - 1 -i (0 = 6, 1=5, 2=4, 3=3)
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] == arr[arr.length - 1 - i]) && (i < arr.length - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	public static boolean isPalindromeByString(int x) {
		boolean isPalindrome = true;
		if (x < 0) {
			return false;
		}
		String str = Integer.toString(x);
		// 1 3 2 1 2 3 1
		// 0 1 2 3 4 5 6
		// length = 6
		// i =0 if i == length - 1 -i (0 = 5, 1=4, 2=3, 3=2)
		// length = 7
		// i =0 if i == length(7) - 1 -i (0 = 6, 1=5, 2=4, 3=3)
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) == str.charAt(str.length() - 1 - i)) && (i < str.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
}