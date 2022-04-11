/*
 * Developed by Luis Espinosa (FullStack Developer)
 */
package com.algorithms.search.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.algorithms.linkedlists.SinglyLinkedList;

/**
 * The Class SinglyLinkedListTest.
 *
 * @author luisespinosa
 */
@DisplayName("SinglyLinkedList tests")
class SinglyLinkedListTest {
	
	@Test
	@DisplayName("Should add new node to the beginning - take O(1)")
	void addNodeAtTheBeginningTest() {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		assertEquals("[]", linkedList.print()); 
		linkedList.addNodeAtTheBeginning(100);
		assertEquals("[100]", linkedList.print());
		linkedList.addNodeAtTheBeginning(200);
		assertEquals("[200,100]", linkedList.print());
	}
	
	@Test
	@DisplayName("Should add new node to the end - take O(1)")
	void addNodeAtTheEnd() {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		assertEquals("[]", linkedList.print()); 
		linkedList.addNodeAtTheEnd(100);
		assertEquals("[100]", linkedList.print());
		linkedList.addNodeAtTheEnd(200);
		assertEquals("[100,200]", linkedList.print());
		linkedList.addNodeAtTheEnd(300);
		assertEquals("[100,200,300]", linkedList.print());
	}
	
	@Test
	@DisplayName("Should add new node at a position - take O(n)")
	void addNodeAtIndex() {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		assertEquals("[]", linkedList.print()); 
		linkedList.addNodeAtIndex(100, 1);
		assertEquals("[100]", linkedList.print());
		linkedList.addNodeAtIndex(200, 1);
		assertEquals("[200,100]", linkedList.print());
		linkedList.addNodeAtIndex(300, 2);
		assertEquals("[200,300,100]", linkedList.print());
		linkedList.addNodeAtIndex(400, 2);
		assertEquals("[200,400,300,100]", linkedList.print());
	}
	
	
	@Test
	@DisplayName("Should delete a node - take O(n)")
	void deleteNode() {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		assertEquals("[]", linkedList.print());
		linkedList.deleteNode(200); // Head null
		linkedList.addNodeAtTheEnd(100);
		assertEquals("[100]", linkedList.print());
		linkedList.addNodeAtTheEnd(200);
		assertEquals("[100,200]", linkedList.print());
		linkedList.addNodeAtTheEnd(300);
		assertEquals("[100,200,300]", linkedList.print());
		linkedList.deleteNode(200);
		assertEquals("[100,300]", linkedList.print());
		linkedList.deleteNode(200); // Not Found
		assertEquals("[100,300]", linkedList.print());
		linkedList.deleteNode(100); // Head is the node to be deleted
		assertEquals("[300]", linkedList.print());
	}
	

}
