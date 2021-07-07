/**
 * 
 */
package com.sb.leet.easy.string;

/**
 * @author ankur
 * @crated 05-Jul-2021
 * 
 *         https://leetcode.com/problems/longest-common-prefix/
 * 
 *         Input: strs = ["flower","flow","flight"] Output: "fl"
 * 
 *         Input: strs = ["dog","racecar","car"] Output: ""
 * 
 * 
 */
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String[] strs = { "ankur", "anku", "ankurankur", "ankur", "anku",
		// "ankurankur" };
		String[] strs = { "flower", "flow", "flight" };
		// String[] strs = { "dog", "racecar", "car" };
		String prefix = longestCommonPrefix(strs);
		System.out.println(prefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		int loop = 0;
		boolean run = true;
		String prefix = "";
		char current = '_';
		while (run) {
			for (int i = 0; i < strs.length; i++) {
				try {
					if (i == 0) {
						current = strs[i].charAt(loop);
					}
					if (strs[i].charAt(loop) != current) {
						run = false;
						break;
					}
				} catch (Exception e) {
					run = false;
					break;
				}
			}
			if (run) {
				prefix = prefix + strs[0].charAt(loop);
			}
			loop++;
		}

		return prefix;
	}
}
