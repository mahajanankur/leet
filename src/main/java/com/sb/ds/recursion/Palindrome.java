/**
 * 
 */
package com.sb.ds.recursion;

/**
 * @author ankur
 * @crated 20-Jul-2021
 * 
 *         Check if a string is a palindrome or not by recursion.
 * 
 *         https://www.youtube.com/watch?v=IJDJ0kBx2LM&ab_channel=freeCodeCamp.org
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "racecar";
		boolean r = isPalindrome(s);
		System.out.println(r);
	}

	private static boolean isPalindrome(String s) {
		// Base case, the empty or a char is also a palindrome.
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		// Recursive case
		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPalindrome(s.substring(1, s.length() - 1));
		}
		return false;
	}

}
