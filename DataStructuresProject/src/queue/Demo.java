package queue;

public class Demo {

	public static void main(String[] args) {
		QueueArray queue = new QueueArray(3);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue);
		
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}

}
