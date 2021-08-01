/**
 * 
 */
package com.sb.grab;

import java.util.Arrays;

/**
 * @author ankur
 * @crated 01-Aug-2021
 * 
 *         ASCI value of a = 97, A = 65, 1 = 49 and empty space = 32
 */
public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent".toLowerCase();
		boolean isAnagram = false;
		// isAnagram =
		// anagramBySort(s1.toLowerCase().toCharArray(),s2.toLowerCase().toCharArray());
		isAnagram = anagramByHashing(s1.toLowerCase().toCharArray(), s2.toLowerCase().toCharArray());
		System.out.println(isAnagram);
	}

	static boolean anagramByHashing(char[] c1, char[] c2) {
		if (c1.length != c2.length) {
			return false;
		}
		int[] hash = new int[26];
		// ASCI value of a = 97, A = 65, 1 = 49 and empty space = 32
		int baseAsci = 97;
		for (int i = 0; i < c1.length; i++) {
			hash[c1[i] - baseAsci]++;
			hash[c2[i] - baseAsci]--;
		}
		for (int j = 0; j < hash.length; j++) {
			if (hash[j] != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Complexity is O(N* log(N))
	 * 
	 * @param c1
	 * @param c2
	 * @return boolean
	 */
	static boolean anagramBySort(char[] c1, char[] c2) {
		if (c1.length != c2.length) {
			return false;
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				return false;
			}
		}
		return true;
	}

}
