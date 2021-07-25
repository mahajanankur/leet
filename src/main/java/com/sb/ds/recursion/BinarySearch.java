/**
 * 
 */
package com.sb.ds.recursion;

/**
 * @author ankur
 * @crated 21-Jul-2021
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { -1, 3, 7, 11, 23, 43, 57, 78, 110, 119, 143 };
		int target = 13;
		int index = search(nums, 0, nums.length - 1, target);
		System.out.println(index);
	}

	/**
	 * Binary search with recursion.
	 * 
	 * @param nums
	 * @param low
	 * @param high
	 * @param target
	 * @return index
	 */
	private static int search(int[] nums, int low, int high, int target) {
		// Edge case nothing find.
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		// Base case.
		if (nums[mid] == target) {
			return mid;
		}
		// Recursive case.
		if (nums[mid] > target) {
			// Consider left half.
			return search(nums, low, mid - 1, target);
		}

		// Consider right half.
		return search(nums, mid + 1, high, target);

	}

	/**
	 * This is the implementation without recursion.
	 * 
	 * @param nums
	 * @param target
	 * @return index
	 */
	public static int searchWithoutRecursion(int[] nums, int target) {
		int low = 0, mid = 0, high = nums.length - 1;
		while (high > low) {
			mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
