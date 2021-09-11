/**
 * 
 */
package com.sb.leet.easy.search;

/**
 * @author ankur
 * @crated 19-Jul-2021
 * 
 *         https://leetcode.com/problems/search-insert-position/
 * 
 *         You must write an algorithm with O(log n) runtime complexity.
 * 
 *         Input: nums = [1,3,5,6], target = 5 Output: 2
 * 
 *         Input: nums = [1,3,5,6], target = 2 Output: 1
 * 
 *         Input: nums = [1,3,5,6], target = 7 Output: 4
 * 
 *         Input: nums = [1,3,5,6], target = 0 Output: 0
 * 
 */
public class SearchInsertPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int target = 63;
		int[] nums = { 0, 4, 5, 8, 10, 19, 28, 45, 56, 67, 78, 87 };
		int result = searchInsert(nums, target);
		System.out.println(result);
	}

	private static int searchInsert(int[] nums, int target) {
		int low = 0, mid = 0, high = nums.length - 1;
		while (high >= low) {
			mid = (low + high) / 2;
			if (nums[mid] > target) {
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		if (target > nums[mid]) {
			return mid + 1;
		}
		return mid;
	}

}
