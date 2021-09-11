/**
 * 
 */
package com.sb.leet.easy.search;

/**
 * @author ankur
 * @crated 11-Sep-2021
 * 
 *         https://leetcode.com/problems/first-bad-version/
 */
public class FirstBadVersion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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
