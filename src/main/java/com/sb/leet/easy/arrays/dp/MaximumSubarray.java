/**
 * 
 */
package com.sb.leet.easy.arrays.dp;

import java.util.Arrays;

/**
 * @author ankur
 * @crated 19-Jul-2021
 * 
 *         https://leetcode.com/problems/maximum-subarray/
 * 
 *         Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation:
 *         [4,-1,2,1] has the largest sum = 6.
 * 
 *         Input: nums = [1] Output: 1
 * 
 *         Input: nums = [5,4,-1,7,8] Output: 23
 * 
 *         Edge case : [-2,1]
 */
public class MaximumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = maxSubArrayMostEfficient(nums);
		System.out.println(result);

	}

	private static int maxSubArraySol(int[] nums) {
		int maxSum = nums[0], length = nums.length;
		for (int i = 1; i < length; i++) {
			if (nums[i - 1] > 0)
				nums[i] = nums[i - 1] + nums[i];
			if (maxSum < nums[i])
				maxSum = nums[i];
		}
		System.out.println(Arrays.toString(nums));
		return maxSum;
	}

	/**
	 * SUM(ij) = SUM(ii) + arr[j];
	 * 
	 * @param nums
	 * @return int
	 */
	private static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int[][] matrix = new int[nums.length][nums.length];
		// Fill the diagonals.
		for (int i = 0; i < nums.length; i++) {
			// Mark the maximum sum.
			if (maxSum < nums[i]) {
				maxSum = nums[i];
			}
			matrix[i][i] = nums[i];
		}
		// SUM(ij) = SUM(ii) + arr[j];
		for (int r = 0; r < nums.length; r++) {
			for (int c = r + 1; c < nums.length; c++) {
				matrix[r][c] = matrix[r][c - 1] + nums[c];
				if (maxSum < matrix[r][c]) {
					maxSum = matrix[r][c];
				}
			}
		}
		// for (int i = 0; i < matrix.length; i++) {
		// System.out.println(Arrays.toString(matrix[i]));
		// }
		return maxSum;
	}

	private static int maxSubArrayMemoryEfficient(int[] nums) {
		int maxSum = nums[0];
		// SUM(ij) = SUM(ii) + arr[j];
		for (int r = 0; r < nums.length; r++) {
			int prevSum = nums[r];
			if (maxSum < prevSum) {
				maxSum = prevSum;
			}
			for (int c = r + 1; c < nums.length; c++) {
				prevSum += nums[c];
				if (maxSum < prevSum) {
					maxSum = prevSum;
				}
			}
		}
		return maxSum;
	}

	private static int maxSubArrayMostEfficient(int[] nums) {
		int maxSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > 0) {
				nums[i] = nums[i - 1] + nums[i];
			}

			if (nums[i] > maxSum) {
				maxSum = nums[i];
			}
		}
		return maxSum;
	}

}
