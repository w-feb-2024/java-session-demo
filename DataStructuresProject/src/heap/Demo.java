package heap;

public class Demo {

	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(20);
		heap.insert(78);
		heap.insert(23);
		heap.insert(100);
		heap.insert(67);
		heap.insert(26);
		heap.insert(89);
		heap.insert(11);
		heap.insert(7);
		
		System.out.println(heap);
	}

}
