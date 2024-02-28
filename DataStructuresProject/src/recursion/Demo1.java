package recursion;

public class Demo1 {

	// write a recursive function to print hello 3 times
	int count = 0;
	void print() {
		// base condition to terminate the recursion
		if(count == 3) return;
		
		System.out.println("hello");
		count++;
		print();
	}
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		demo.print();

	}

}
