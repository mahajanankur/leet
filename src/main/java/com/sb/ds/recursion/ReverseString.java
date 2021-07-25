/**
 * 
 */
package com.sb.ds.recursion;

import java.util.Arrays;

/**
 * @author ankur
 * @crated 20-Jul-2021
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "recursion is very easy";
		String r = reverse(s);
		System.out.println(r);
		char[] arr = { 'h', 'e', 'l', 'l', 'o' };
		reverseArrayBySwap(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverseArrayBySwap(char[] s) {
		char temp = 'a';
		for (int i = 0; i < s.length; i++) {
			if (s.length - 1 - i > i) {
				temp = s[i];
				s[i] = s[s.length - 1 - i];
				s[s.length - 1 - i] = temp;
			}
		}
	}

	private static String reverse(String s) {
		// Base case.
		if (s.equals("")) {
			return "";
		}
		// Recursive case.
		// get the first char and append it to last and send the rest of string for
		// processing again till the length is 0
		return reverse(s.substring(1)) + s.charAt(0);
	}

}
