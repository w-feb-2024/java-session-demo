package linkedlist;

public class Demo {

	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.insertAtHead(25);
		linkedList.insertAtHead(65);
		linkedList.insertAtHead(15);
		linkedList.insertAtHead(35);
		
		linkedList.insertAtTail(30);
		linkedList.insertAtTail(90);
		
		
		System.out.println(linkedList);
		
		linkedList.removeAtHead();
		
		System.out.println(linkedList);

		linkedList.removeAtTail();
		
		System.out.println(linkedList);
	}

}
