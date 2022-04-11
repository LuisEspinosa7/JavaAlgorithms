/*
 * Developed by Luis Espinosa (FullStack Developer)
 */
package com.algorithms.search.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The Class ArrayRecursiveBinarySearchTest.
 *
 * @author luisespinosa
 */
@DisplayName("Recursive binary test")
class ArrayRecursiveBinarySearchTest {

	/**
	 * Index by binary search second middle test.
	 */
	@Test
	@DisplayName("Should have index 6 - Take O(1) time and O(log 1) space")
	void indexByBinarySearchSecondMiddleTest() {
		int[] elements = {10, 12, 16, 18, 20, 28, 35, 40};
		int index = ArrayRecursiveBinarySearch.indexByRecursiveBinarySearch(elements, 35, 0, elements.length - 1);
		assertEquals(6, index);
	}

	/**
	 * Index by binary search first middle test.
	 */
	@Test
	@DisplayName("Should have index 1 - Take O(1) time and O(log 1) space")
	void indexByBinarySearchFirstMiddleTest() {
		int[] elements = {10, 12, 16, 18, 20, 28, 35, 40};
		int index = ArrayRecursiveBinarySearch.indexByRecursiveBinarySearch(elements, 12, 0, elements.length - 1);
		assertEquals(1, index);
	}
	
	/**
	 * Index by binary search empty array test.
	 */
	@Test
	@DisplayName("Should have index -1 - Take O(1) time and O(log 1) space")
	void indexByBinarySearchEmptyArrayTest() {
		int[] elements = {};
		int index = ArrayRecursiveBinarySearch.indexByRecursiveBinarySearch(elements, 12, 0, elements.length - 1);
		assertEquals(-1, index);
	}
}
