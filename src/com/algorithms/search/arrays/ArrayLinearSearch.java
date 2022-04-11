/*
 * Developed by Luis Espinosa (FullStack Developer)
 */
package com.algorithms.search.arrays;


/**
 * The Class ArrayLinearSearch.
 * @author luisespinosa
 */
public class ArrayLinearSearch {
	
	/**
	 * Index by linear search.
	 *
	 * @param data the data
	 * @param target the target
	 * @return the int
	 */
	// Time: O(n) Space: O(n)
	static int indexByLinearSearch(int[] data, int target) {
		int first = 0;
		int last = data.length - 1;
		
		while(first <= last) {
			if (data[first] == target) {
				return first;
			}
			first += 1;
		}
		
		return -1;
	}

}
