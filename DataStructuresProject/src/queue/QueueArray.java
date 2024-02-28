package queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueArray {
	int[] items;
	int front;
	int rear;	
	
	public QueueArray(int length) {
		items = new int[length];
	}
	
	private boolean isFull() {
		return rear == items.length;
	}
	
	public void enqueue(int data) {
		// check if items array is full
		if(isFull()) {
			// if it is full, we have to grow the array
			// to grow, create a new array twice the size of the existing array
			int[] growItems = new int[2 * items.length];
			// copy all the elements from the existing array to the new array
			System.arraycopy(items, 0, growItems, 0, items.length);
			// make the exit to the new array object
			items = growItems;
		}
		// add the element at the rear index
		// increment rear
		items[rear++] = data;
	}

	public int size() {
		return rear - front;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is Empty!");
		}
		// return the front element
		// increment the front index
		return items[front++];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is Empty!");
		}
		// return the front element
		// increment the front index
		return items[front];
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("items = [");
		for(int i=front;i<rear;i++) {
			sb.append(items[i]).append((i==rear-1?"":","));
		}
		sb.append("]");
		return sb.toString();
	}
}


// 0 - 10
// 1 - 20
// 2 - 30
// 3 - 40
// 4 - 0
// 5 - 0
// dequeue
// 0 - 0
// 1 - 20
// 2 - 30
// 3 - 40
// 4 - 0
// 5 - 0
// enqueue
//0 - 0
//1 - 20
//2 - 30
//3 - 40
//4 - 50
//5 - 0
// dequeue
//0 - 0
//1 - 0
//2 - 30
//3 - 40
//4 - 50
//5 - 0

// to solve the above issue we can optimize the queue to make it a circular  queue