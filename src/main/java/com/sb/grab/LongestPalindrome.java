/**
 * 
 */
package com.sb.grab;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ankur
 * @crated 15-Jul-2021
 * 
 *         https://www.geeksforgeeks.org/must-do-coding-questions-for-companies-like-amazon-microsoft-adobe/
 * 
 *         https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1
 */
public class LongestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "aaabbb";
		longestPalindromeFirst(str);

	}

	// Time limit exceeded.
	private static void longestPalindromeFirst(String str) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.length() >= (j + i + 1)) {
					String substring = str.substring(j, j + i + 1);
					list.add(substring);
				}
			}
		}

		String palindrome = null;
		for (int ind = list.size() - 1; ind >= 0; ind--) {
			// System.out.println(list.get(ind) + " : " + isPalindrome(list.get(ind)));
			if (isPalindrome(list.get(ind))) {
				if (null == palindrome) {
					palindrome = list.get(ind);
				} else {
					if (palindrome.length() == list.get(ind).length()) {
						palindrome = list.get(ind);
					} else {
						break;
					}
				}
			}
		}
		System.out.println(palindrome);
	}

	/**
	 * O(n/2) = O(n) as it only run for half of the string length;
	 * 
	 * @param str
	 * @return boolean
	 */
	private static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i) && (str.length() - 1 - i) > i) {
				return false;
			}
		}
		return true;
	}

}
