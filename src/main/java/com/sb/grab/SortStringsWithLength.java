/**
 * 
 */
package com.sb.grab;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ankur
 * @crated 18-Jul-2021
 * 
 *         Paytm Question.
 * 
 *         Sort an array of string based on the length, if length is equal then
 *         sort alphabetically.
 * 
 */
public class SortStringsWithLength {

	static class LengthComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			if (o1.length() == o2.length()) {
				return o1.compareTo(o2);
			}
			return o1.length() - o2.length();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = { "aaa", "xty", "aztxy", "ac", "bac", "xtyza", "bc", "aab", "tyzx", "yzt", "abc" };
		String[] sorted = firstApproach(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(sorted[i]);
		}

	}

	private static String[] firstApproach(String[] arr) {
		Arrays.sort(arr, new LengthComparator());
		return arr;
	}

}
