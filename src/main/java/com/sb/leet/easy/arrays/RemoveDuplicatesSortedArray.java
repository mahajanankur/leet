/**
 * 
 */
package com.sb.leet.easy.arrays;

import java.util.Arrays;

/**
 * @author ankur
 * @crated 19-Jul-2021
 * 
 *         https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 *         Do not allocate extra space for another array. You must do this by
 *         modifying the input array in-place with O(1) extra memory.
 * 
 *         Input: nums = [1,1,2] Output: 2, nums = [1,2,_]
 * 
 *         Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums =
 *         [0,1,2,3,4,_,_,_,_,_]
 */
public class RemoveDuplicatesSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int result = removeDuplicates(nums);
		System.out.println(result);
		System.out.println(Arrays.toString(nums));

	}

	private static int removeDuplicates(int[] nums) {
		int count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				count++;
			} else {
				// Set it to 101 as its an outer range.
				nums[i] = 101;
			}
		}
		Arrays.sort(nums);
		return count;
	}

}
