/**
 * 
 */
package com.sb.leet.medium.arrays;

import java.util.Arrays;

/**
 * @author ankur
 * @crated 11-Sep-2021
 * 
 *         https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] nums = { -1, -100, 3, 99 };
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotateByExtraSpace(nums, k);
		System.out.println(Arrays.toString(nums));

	}

	public static void rotateByExtraSpace(int[] nums, int k) {
		int[] rot = new int[nums.length];
		int mid = nums.length - 1 - k;
		int ind = mid + 1;
		// End part to front
		for (int i = 0; i <= mid; i++) {
			rot[i] = nums[ind++];
		}
		// Front to end.
		ind = 0;
		for (int i = mid + 1; i < rot.length; i++) {
			rot[i] = nums[ind++];
		}
		for (int i = 0; i < rot.length; i++) {
			nums[i] = rot[i];
		}

	}

	public static void rotate(int[] nums, int k) {
		int low = 0, high = nums.length - k;
		while (nums.length > high) {
			int temp = nums[low];
			nums[low++] = nums[high];
			nums[high++] = temp;
		}
		System.out.println(Arrays.toString(nums));
	}

}
