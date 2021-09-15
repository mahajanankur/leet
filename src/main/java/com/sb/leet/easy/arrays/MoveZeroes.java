/**
 * 
 */
package com.sb.leet.easy.arrays;

import java.util.Arrays;

/**
 * @author ankur
 * @crated 15-Sep-2021
 * 
 *         https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] nums = { 0, 19, 0, 1, 0, 3, 12, 0, 0, 0 };
		// int[] nums = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };
		int[] nums = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0, 0 };
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void moveZeroes(int[] nums) {
		int low = 0, high = low + 1;
		while (high >= low && nums.length > high) {
			if (nums[low] == 0) {
				if (nums[high] != 0) {
					int temp = nums[low];
					nums[low++] = nums[high];
					nums[high++] = temp;
				} else {
					high++;
				}
			} else {
				low++;
				if (high != 0) {
					high++;
				}
			}
		}
	}

}
