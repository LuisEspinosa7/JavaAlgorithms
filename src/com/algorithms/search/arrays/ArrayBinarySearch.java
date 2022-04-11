/*
 * Developed by Luis Espinosa (FullStack Developer)
 */
package com.algorithms.search.arrays;

/**
 * The Class ArrayBinarySearch.
 * @author luisespinosa
 */
public class ArrayBinarySearch {
	
	
	/**
	 * Index by binary search.
	 *
	 * @param data the data
	 * @param target the target
	 * @return the int
	 */
	// Time: O(1) Space: O(log 1)
	static int indexByBinarySearch(int[] data, int target) {
		int first = 0;
		int last = data.length - 1;
		
		while(first <= last) {
			int middlePoint = (first + last) / 2;
			if (data[middlePoint] == target) {
				return middlePoint;
			} else if(data[middlePoint] < target) {
				first = middlePoint + 1;
			} else if (data[middlePoint] > target) {
				last = middlePoint - 1;
			}
		}
		
		return -1;
	}

}
