/**
 * 
 */
package com.sb.leet.medium.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ankur
 * @crated 12-Aug-2021
 * 
 *         https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 *         Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc",
 *         with the length of 3. Example 2:
 * 
 *         Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the
 *         length of 1. Example 3:
 * 
 *         Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with
 *         the length of 3. Notice that the answer must be a substring, "pwke"
 *         is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abcdebcbb";
		int res = lengthOfLongestSubstring(s);
		System.out.println(res);

	}

	/**
	 * The idea is use a hash set to track the longest substring without repeating
	 * characters so far, use a fast pointer high to see if character[high] is in
	 * the hash set or not, if not, great, add it to the hash set, move high forward
	 * and update the max length, otherwise, delete from the head by using a slow
	 * pointer low until we can put character high to the hash set.
	 * 
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int low = 0, high = 0, max = 0, length = s.length();
		while (length > low) {
			if (!set.contains(s.charAt(low))) {
				set.add(s.charAt(low++));
				max = Math.max(set.size(), max);
			} else {
				set.remove(s.charAt(high++));
			}
		}
		return max;
	}

}
