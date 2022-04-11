/*
 * Developed by Luis Espinosa (FullStack Developer)
 */
package com.algorithms.search.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The Class ArrayBinarySearchTest.
 * @author luisespinosa
 */
@DisplayName("Binary Search tests")
class ArrayBinarySearchTest {

	/**
	 * Index by binary search second middle test.
	 */
	@Test
	@DisplayName("Should have index 6 - Take O(1) time and O(log 1) space")
	void indexByBinarySearchSecondMiddleTest() {
		int[] elements = {10, 12, 16, 18, 20, 28, 35, 40};
		int index = ArrayBinarySearch.indexByBinarySearch(elements, 35);
		assertEquals(6, index);
	}
	
	/**
	 * Index by binary search first middle test.
	 */
	@Test
	@DisplayName("Should have index 1 - Take O(1) time and O(log 1) space")
	void indexByBinarySearchFirstMiddleTest() {
		int[] elements = {10, 12, 16, 18, 20, 28, 35, 40};
		int index = ArrayBinarySearch.indexByBinarySearch(elements, 12);
		assertEquals(1, index);
	}
	
	/**
	 * Index by linear search empty array test.
	 */
	@Test
	@DisplayName("Should have index -1 - empty array")
	void indexByLinearSearchEmptyArrayTest() {
		int[] elements = new int[] {};
		int index = ArrayBinarySearch.indexByBinarySearch(elements, 35);
		assertEquals(-1, index);
	}

}
