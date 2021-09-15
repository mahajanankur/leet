/**
 * 
 */
package com.sb.leet.easy.arrays;

import java.util.Arrays;

/**
 * @author ankur
 * @crated 11-Sep-2021
 * 
 *         https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		int[] sortedSquares = sortedSquares(nums);
		System.out.println(Arrays.toString(sortedSquares));

	}

	public static int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
}
