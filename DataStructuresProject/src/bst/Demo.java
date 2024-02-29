package bst;

public class Demo {

	public static void main(String[] args) {
		MyBinarySearchTree bst = new MyBinarySearchTree();
		bst.insert(25);
		bst.insert(20);
		bst.insert(27);
		bst.insert(15);
		bst.insert(22);
		bst.insert(26);
		bst.insert(30);
		bst.insert(29);
		bst.insert(32);

		System.out.println(bst.traverse());
		
		System.out.println("Minimum value : " + bst.min());
		System.out.println("Maximum value : " + bst.max());
		
		bst.delete(20);
		System.out.println(bst.traverse());
		
	}

}
