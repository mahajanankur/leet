/**
 * 
 */
package com.sb.leet.easy.search;

/**
 * @author ankur
 * @crated 11-Sep-2021
 * 
 *         https://leetcode.com/problems/binary-search/
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12, 14 };
		int target = 112;
		int index = search(nums, target);
		System.out.println(index);
	}

	public static int search(int[] nums, int target) {
		int low = 0, mid = 0, high = nums.length;
		while (high > low) {
			mid = (low + high) / 2;
			if (target > nums[mid]) {
				low = mid + 1;
			} else if (target < nums[mid]) {
				high = mid;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
