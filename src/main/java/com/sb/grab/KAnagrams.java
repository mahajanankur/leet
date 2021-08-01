/**
 * 
 */
package com.sb.grab;

/**
 * @author ankur
 * @crated 01-Aug-2021
 * 
 *         Given two strings of lower-case alphabets and a value k, the task is
 *         to find if two strings are K-anagrams of each other or not. Two
 *         strings are called k-anagrams if following two conditions are true.
 * 
 *         1. Both have same number of characters.
 * 
 *         2. Two strings can become anagram by changing at most k characters in
 *         a string.
 */
public class KAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "geeks", str2 = "eggkf";
		int k = 1;
		boolean agram = isAnagram(str1, str2, k);
		System.out.println(agram);
	}

	/**
	 * Make sure two strings of lower-case alphabets.
	 * 
	 * @param str1
	 * @param str2
	 * @param k
	 * @return boolean
	 */
	private static boolean isAnagram(String str1, String str2, int k) {
		if (str1.length() != str2.length()) {
			return false;
		}
		int[] hash = new int[26];
		int baseAsci = 97;
		for (int i = 0; i < str1.length(); i++) {
			hash[str1.charAt(i) - baseAsci]++;
			hash[str2.charAt(i) - baseAsci]--;
		}

		for (int j = 0; j < hash.length; j++) {
			if (hash[j] != 0) {
				if (k < -1) {
					return false;
				}
				k -= Math.abs(hash[j]);
			}
		}
		if (k != -1) {
			return false;
		}
		return true;
	}

}
