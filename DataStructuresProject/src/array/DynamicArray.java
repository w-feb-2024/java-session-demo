package array;

import java.util.Arrays;

// a Dynamic array can grow as we add elements -  not fixed size
public class DynamicArray {
	int[] items;
	int size;
	
	public DynamicArray(int length) {
		items = new int[length];
	}
	
	private boolean isFull() {
		return size == items.length;
	}
	
	public void insert(int data) {
		// check if the array is full
		if(isFull()) {
			// if it is full, we have to grow the array
			// to grow, create a new array twice the size of the existing array
			int[] growItems = new int[2 * items.length];
			// copy all the elements from the existing array to the new array
			System.arraycopy(items, 0, growItems, 0, items.length);
			// make the exit to the new array object
			items = growItems;
		}
		items[size++] = data;
		//size++;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int size() {
		return size;
	}
	
	public int remove(int data) {
		// check if the array is emty
		// throw an exception
		// first find the index of data
		// shift the data of index+1 to index until the end of the array is reached
		// decrement size
		// return index if found or -1 if not found
		return -1;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("items = [");
		for(int i=0;i<size;i++) {
			sb.append(items[i]).append((i==size-1?"":","));
		}
		sb.append("]");
		return sb.toString();
	}
	
	
}
