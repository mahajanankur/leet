/**
 * 
 */
package com.sb.grab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ankur
 * @crated 15-Jul-2021
 * 
 *         https://www.geeksforgeeks.org/must-do-coding-questions-for-companies-like-amazon-microsoft-adobe/
 * 
 *         https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1
 * 
 *         Solution is Time - O(n^2) and space - O(n)
 * 
 *         DP solution Time - O(n^2) and space - O(n^2)
 */
public class LongestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "aaabbaa";
		// longestPalindromeFirst(str);
		longestPalindromeByDP(str);

	}

	private static void longestPalindromeByDP(String str) {
		// "aaabbb" - if greater than 2 then str(i, j) - if char(i) = char(j) and
		// str(i+1, j-1) is also a palindrome
		int[][] grid = new int[str.length()][str.length()];
		// add all the single true.
		for (int i = 0; i < grid.length; i++) {
			grid[i][i] = 1;
		}
		// add for all the length 2.
		for (int i = 0; i < grid.length - 1; i++) {
			for (int j = i + 1; j <= i + 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					grid[i][j] = 1;
				} else {
					grid[i][j] = 0;
				}

			}
		}

		// add for all the length 3.
		for (int i = 0; i < grid.length - 2; i++) {
			for (int j = i + 2; j <= i + 2; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					grid[i][j] = 1;
				} else {
					grid[i][j] = 0;
				}

			}
		}

		// add for all the length greater than 3.
		for (int i = 0; i < grid.length; i++) {
			for (int j = i + 3; j < grid.length; j++) {
				if (str.charAt(i) == str.charAt(j) && grid[i + 1][j - 1] == 1) {
					grid[i][j] = 1;
				} else {
					grid[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < grid.length; i++) {
			System.out.println(i + " " + Arrays.toString(grid[i]));
		}

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
