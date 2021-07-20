/**
 * 
 */
package com.sb.ds.recursion;

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
