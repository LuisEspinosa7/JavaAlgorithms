/*
 * Developed by Luis Espinosa (FullStack Developer)
 */
package com.algorithms.search.arrays;

/**
 * The Class ArrayRecursiveBinarySearch.
 *
 * @author luisespinosa
 */
public class ArrayRecursiveBinarySearch {
	
	/**
	 * Index by recursive binary search.
	 *
	 * @param data the data
	 * @param target the target
	 * @param start the start
	 * @param end the end
	 * @return the int
	 */
	static int indexByRecursiveBinarySearch(int[] data, int target,int start, int end) {
		if (data.length == 0 || start >= end) {
			return -1;
		}
		
		int middlePoint = (start + end) / 2;

		if(data[middlePoint] < target) {
			return indexByRecursiveBinarySearch(data, target, middlePoint + 1, end);
		} else if(data[middlePoint] > target) {
			return indexByRecursiveBinarySearch(data, target, start, middlePoint - 1);
		} else {
			return middlePoint;
		}
		
	}
	
}
