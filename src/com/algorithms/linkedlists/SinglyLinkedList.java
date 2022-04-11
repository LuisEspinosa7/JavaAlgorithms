/*
 * Developed by Luis Espinosa (FullStack Developer)
 */
package com.algorithms.linkedlists;

/**
 * The Class SinglyLinkedList.
 *
 * @author luisespinosa
 */
public class SinglyLinkedList {
	
	/** The head. */
	public Node head = null;
	
	/**
	 * The Class Node.
	 */
	class Node {
		
		/** The data. */
		private int data;
		
		/** The next. */
		private Node next;
		
		/**
		 * Instantiates a new node.
		 *
		 * @param data the data
		 */
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	/**
	 * Adds the node at the beginning.
	 *
	 * @param data the data
	 */
	public void addNodeAtTheBeginning(int data) {
		Node newNode = new Node(data);
		if (this.head == null) { // Validate if empty
			this.head = newNode;
		} else {
			newNode.next = this.head;
			this.head = newNode;
		}
	}
	
	
	public void addNodeAtTheEnd(int data) {
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head = newNode; // Validate if empty
		} else {
			Node current = this.head;
			while(current.next != null) { // Until the last node
				current = current.next; // Advance 1 node ahead
			}
			current.next = newNode; // The last element now is the newNode
		}
	}
	
	
	public void addNodeAtIndex(int data, int position) {
		Node newNode = new Node(data);
		Node current = this.head, previous = this.head;
		if (position == 1) { // In the first position
			newNode.next = head;
			this.head = newNode;
			return;
		}
		
		while(current.next != null && --position > 0) { // To find the right nodes
			previous = current;
			current = current.next;
		}
		
		previous.next = newNode; // New node fitted
		newNode.next = current; // Between the previous and the current positions.
	}
	
	
	/**
	 * Delete node.
	 *
	 * @param data the data
	 */
	/**
	 * @param data
	 */
	public void deleteNode(int data) {
		if(this.head == null) return;
		Node current = this.head, previous = this.head;
		if(this.head.data == data) { // Head is the node to be deleted
			this.head = this.head.next;
			return;
		}
		
		while(current != null && current.data != data) { // Traversing the list
			previous = current;
			current = current.next;
		}
		if(current != null) { // Node was found
			previous.next = current.next;
		} else {
			System.out.println("Not Found");
		}
	}
	
	/**
	 * Prints the.
	 */
	public String print() {
		StringBuffer result = new StringBuffer();
		if(this.head == null) {
			System.out.println("Empty List");
			result.append("[]");
		} else {
			Node current = this.head;
			result.append("[");
			while(current != null) {
				result.append(current.data + (current.next != null ? "," : ""));
				current = current.next;
			}
			result.append("]");
		}
		System.out.println(result.toString());
		return result.toString();
	}
	
	
	
	

}
