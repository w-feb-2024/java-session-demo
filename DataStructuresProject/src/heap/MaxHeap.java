package heap;

public class MaxHeap {
	private int[] heap;
	private int size;
	
	public MaxHeap(int length) {
		heap = new int[length];
	}
	
	private boolean isFull() {
		return size == heap.length;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getParent(int childIndex) {
		int parentIndex = (childIndex - 1) / 2;
		return parentIndex;
	}
	
	public int getLeftChild(int parentIndex, boolean flag) {
		int childIndex = 2 * parentIndex + (flag?1:2);
		return childIndex;
	}
	
	private void fixHeapAbove(int index) {
		int newValue = heap[index];
		while(index>0 && newValue>heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index  =getParent(index);
		}
		// no swaping in the while loop
		heap[index] = newValue;
	}
	
	public void insert(int newData) {
		if(isFull())
			throw new IndexOutOfBoundsException("Heap is full!");
		//1. add the new data to the last of the array
		heap[size] = newData;
		//2. heapify the heap above/upwards
		fixHeapAbove(size);
		size++;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("heap = [");
		for(int i=0;i<size;i++) {
			sb.append(heap[i]).append((i==size-1?"":","));
		}
		sb.append("]");
		return sb.toString();
	}
}
