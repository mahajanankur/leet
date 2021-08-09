/**
 * 
 */
package com.sb.leet.medium.arrays;

/**
 * @author ankur
 * @crated 03-Aug-2021
 * 
 *         https://leetcode.com/problems/container-with-most-water/
 * 
 */
public class ContainerWithMostWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] height = { 1, 4, 3, 2, 10, 3, 7, 10, 4 };
		System.out.println(maxArea(height));

	}

	public static int maxArea(int[] height) {
		int hMin = 0, hMax = height.length - 1, area = 0, temp = 0;
		if (height[hMin] > height[hMax]) {
			temp = hMax;
			hMax = hMin;
			hMin = temp;
		}
		area = hMin * Math.abs(hMax - hMin);

		while (hMin != hMax) {
			if (height[hMin] > height[hMax]) {
				temp = hMax;
				hMax = hMin;
				hMin = temp;
			} else {
				area = hMin * Math.abs(hMax - hMin);
				while (true) {

				}
			}
		}
		return 0;

	}
}
