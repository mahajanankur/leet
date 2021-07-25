/**
 * 
 */
package com.sb.ds.recursion;

import java.util.Arrays;

/**
 * @author ankur
 * @crated 25-Jul-2021
 * 
 *         Merge sort is a sorting algorithm with efficient time complexity
 *         O(n*log(n)) in all cases. It works on recursion.
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 4, -1, 6, -10, 1, 10, 7, 6, 12, -8, 100, 43 };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr, int low, int high) {
		// base condition.
		if (high > low) {
			int mid = (low + high) / 2;
			// sort left half of the array inclusive.
			sort(arr, low, mid);
			// sort right half of the array.
			sort(arr, mid + 1, high);
			// merge both the half
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		// merge pointers
		int i = low, j = mid + 1, k = 0;
		// Compare both arrays linearly
		while (mid >= i && high >= j) {
			if (arr[i] >= arr[j]) {
				temp[k++] = arr[j++];
			} else {
				temp[k++] = arr[i++];
			}
		}
		// add rest of the values of left sub-array
		while (mid >= i) {
			temp[k++] = arr[i++];
		}
		// add rest of the values of right sub-array
		while (high >= j) {
			temp[k++] = arr[j++];
		}
		// copy value to main array.
		for (i = low; i <= high; i++) {
			arr[i] = temp[i - low];
		}
	}

}
