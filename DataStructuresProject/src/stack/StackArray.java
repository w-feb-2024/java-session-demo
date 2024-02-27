package stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StackArray {

	int[] items;
	int top;
	
	public StackArray(int length) {
		items = new int[length];
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}
	
	public int size() {
		return top;
	}
	
	private boolean isFull() {
		return (top == items.length);
	}
	
	public void push(int data) {
		// this stack does not grow
		if(isFull()) throw new StackOverflowError("Stack is full!");
		items[top++] = data;
	}
	
	public int pop() {
		if(isEmpty()) throw new NoSuchElementException("Stack is Empty!");
		return items[--top];
	}
	
	public int peek() {
		if(isEmpty()) throw new NoSuchElementException("Stack is Empty!");
		return items[top-1];
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("items = [");
		for(int i=0;i<top;i++) {
			sb.append(items[i]).append((i==top-1?"":","));
		}
		sb.append("]");
		return sb.toString();
	}
	
	
}
