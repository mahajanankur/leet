/**
 * 
 */
package com.sb.leet.easy.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ankur
 * @crated 05-Jul-2021
 * 
 *         https://leetcode.com/problems/roman-to-integer/
 * 
 *         Input: s = "III" Output: 3
 * 
 *         Input: s = "IV" Output: 4
 * 
 *         Input: s = "LVIII" Output: 58 Explanation: L = 50, V= 5, III = 3.
 * 
 *         Input: s = "MCMXCIV" Output: 1994 Explanation: M = 1000, CM = 900, XC
 *         = 90 and IV = 4.
 */
public class RomanToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String roman = "LVIII";
		int value = romanToInt(roman);
		System.out.println(value);

	}

	private static int romanToInt(String s) {
		Map<Character, Integer> map = buildValueMap();
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1) {
				result += map.get(s.charAt(i));
			} else {
				if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
					result += map.get(s.charAt(i));
				} else {
					result -= map.get(s.charAt(i));
				}
			}
		}

		return result;
	}

	private static Map<Character, Integer> buildValueMap() {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		return map;
	}

}
