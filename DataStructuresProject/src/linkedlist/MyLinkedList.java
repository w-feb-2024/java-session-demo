package linkedlist;

import java.util.NoSuchElementException;

public class MyLinkedList {
	
	private class Node {
		private int value;
		private Node nextNode;
		
		public Node(int data) {
			this.value = data;
		}
	}
	
	private Node head;
	private Node tail;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertAtHead(int data) {
		// create a new node object and keep it
		Node newNode = new Node(data);
		// check if the LL is empty
		if(isEmpty()) {
			// then make head and tail point to the new node
			head = tail = newNode;
		} else {
			// otherwise
			// make the next of the new node point to whatever head is pointing to
			newNode.nextNode = head;
			// update the head - make head point to the new node
			head = newNode;
		}
	}

	public void insertAtTail(int data) {
		// create a new node object and keep it
		Node newNode = new Node(data);
		// check if the LL is empty
		if(isEmpty()) {
			// then make head and tail point to the new node
			head = tail = newNode;
		} else {
			// otherwise
			// make the next of the tail node point to the new node
			tail.nextNode = newNode;
			// update the tail - make tail point to the new node
			tail = newNode;
		}
	}
	
	public void removeAtHead() {
		if(isEmpty()) throw new NoSuchElementException("Linked List is Empty!");
		if(head == tail) {
			head = tail = null;
			return;
		}
		// hold the reference of head temporily in removeNode
		Node removeNode = head;
		// make head point to second node in the LL
		head = head.nextNode;
		// detaching the first node from the new first node
		removeNode.nextNode = null;
	}
	
	public void removeAtTail() {
		if(isEmpty()) throw new NoSuchElementException("Linked LIst is Empty!");
		if(head == tail) {
			head = tail = null;
			return;
		}
		// traverse and find out the second last(currentNode) node of the LL
		Node currentNode = head;
		while(currentNode != null) {
			// have we reached the second last
			if(currentNode.nextNode == tail) break;
			currentNode = currentNode.nextNode;
		}
		// make the tail point to the second last node(currentNode)
		tail = currentNode;
		// make the tail's next point to null ( so we are detaching the old last node)
		tail.nextNode = null;
	}
	
	public int indexOf(int searchItem) {
		// initialize index to -1 / 0
		// traverse through the linked list
		// check if searchItem == node's value, then break
		// else increment index and continue the loop
		// return index
		return -1;
	}
	
	public boolean contains(int searchItem) {
		// can be finished in 1 line
		return false;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("items = [");
		Node currentNode = head;
		while(currentNode!=null) {
			sb.append(currentNode.value).append((currentNode.nextNode == null)?"":",");
			currentNode = currentNode.nextNode;
		}
		sb.append("]");
		return sb.toString();
	}
	
	
}
