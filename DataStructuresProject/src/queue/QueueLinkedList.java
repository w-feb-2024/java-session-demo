package queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueLinkedList {
	LinkedList<Integer> items;
	
	public QueueLinkedList() {
		items = new LinkedList<>();
	}
	
	private boolean isFull() {
		return false;
	}
	
	public void enqueue(int data) {
		
	}

	public int size() {
		return 0;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public int dequeue() {
		return 0;
	}
	
	public int peek() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
