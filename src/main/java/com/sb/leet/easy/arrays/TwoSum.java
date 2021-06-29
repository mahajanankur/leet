/**
 * 
 */
package com.sb.leet.easy.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ankur
 * @crated 29-Jun-2021
 * 
 *         https://leetcode.com/problems/two-sum/
 * 
 *         Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1]
 *         Output: Because nums[0] + nums[1] == 9, we return [0, 1]
 * 
 *         Example 2: Input: nums = [3,2,4], target = 6 Output: [1,2]
 * 
 *         Example 3: Input: nums = [3,3], target = 6 Output: [0,1]
 *         
 *         Note down - Make sure no number is greater than target.
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] nums = IntStream.generate(() -> new
		// Random().nextInt(100)).limit(100).toArray();
		// int[] nums = { 2, 7, 11, 15 };
		// int target = 9;
		// int[] nums = { 3, 2, 4 };
		// int target = 6;
		// int[] nums = { 3, 3 };
		int[] nums = { -1, -2, -3, -4, -5 };
		int target = -8;
		int[] res = firstApproach(nums, target);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	/**
	 * Consider the elements occurrence is only once.
	 * 
	 * @param nums
	 * @param target
	 */
	private static int[] firstApproach(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		// O(n)
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int j = 0; j < nums.length; j++) {
			int diff = target - nums[j];
			Integer elem = map.get(diff);
			if (null != elem && elem != j) {
				result[0] = j;
				result[1] = elem;
				break;
			}
		}
		return result;
	}

}
