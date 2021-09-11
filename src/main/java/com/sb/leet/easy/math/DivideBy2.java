/**
 * 
 */
package com.sb.leet.easy.math;

/**
 * @author ankur
 * @crated 10-Sep-2021
 * 
 *         https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class DivideBy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		firstApproach(4);

	}

	private static int firstApproach(int i) {
		int ops = 0;
		if (i == 0) {
			return 0;
		}
		while (i > 0) {
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = i - 1;
			}
			ops++;
		}
		return ops;
	}

}
