package com.algorithms.search.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Linear search Tests")
class ArrayLinearSearchTest {

	@Test
	@DisplayName("Should have index 6 - Take O(n) time and O(1) space")
	void indexByLinearSearchTest() {
		int[] elements = {10, 12, 16, 18, 20, 28, 35, 40};
		int index = ArrayLinearSearch.indexByLinearSearch(elements, 35);
		assertEquals(6, index);
	}
	
	@Test
	@DisplayName("Should have index -1 - empty array")
	void indexByLinearSearchEmptyArrayTest() {
		int[] elements = new int[] {};
		int index = ArrayLinearSearch.indexByLinearSearch(elements, 35);
		assertEquals(-1, index);
	}

}
