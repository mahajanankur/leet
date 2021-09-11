/**
 * 
 */
package com.sb.leet.medium.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ankur
 * @crated 04-Aug-2021
 * 
 *         https://leetcode.com/problems/3sum/
 */
public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		// int[] nums = { 0, 0 };
		// int[] nums = { 0, 0, 0, 0, 0, 0, 0 };
		// int[] nums = { -1, 0, 1, 0 };
		// Set<Integer> set = new LinkedHashSet<>();
		// List<List<Integer>> sum = threeSum(nums);
		List<List<Integer>> sum = threeSumByPointers(nums);
		System.out.println(sum.toString());
	}

	private static List<List<Integer>> threeSumByPointers(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int low = i + 1, high = nums.length - 1;
			while (high > low) {
				if (nums[i] + nums[low] + nums[high] > 0) {
					while (high > low && nums[high] == nums[high - 1]) {
						high--;
					}
					high--;
				} else if (nums[i] + nums[low] + nums[high] < 0) {
					while (high > low && nums[low] == nums[low + 1]) {
						low++;
					}
					low++;
				} else {
					res.add(Arrays.asList(nums[i], nums[low], nums[high]));
					// Edge case if last number is same as current iteration.
					while (high > low && nums[high] == nums[high - 1]) {
						high--;
					}
					while (high > low && nums[low] == nums[low + 1]) {
						low++;
					}
					
					low++;
					high--;
				}
			}

		}
		return res;
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<>();
		for (int m = 0; m < nums.length; m++) {
			map.put(nums[m], m);
		}
		// Case for all 0s
		if (null != map && map.size() == 1 && nums.length > 2 && null != map.get(0)) {
			res.add(Arrays.asList(0, 0, 0));
			return res;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				break;
			}
			// Edge case if last element is same then don't check.
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int target = Math.abs(nums[i]);
			// Now it become 2sum problem.
			for (int k = i + 1; k < nums.length; k++) {
				List<Integer> pairs = new ArrayList<Integer>();
				int bal = target - nums[k];
				if (null != map.get(bal) && map.get(bal) != k && map.get(bal) != i && k < map.get(bal)) {
					System.out.println("i = " + i + " | k = " + k + " | Map j = " + map.get(bal));
					pairs.add(nums[i]);
					pairs.add(nums[k]);
					pairs.add(bal);

					res.add(pairs);
				}
			}
		}
		return res;
	}
}
