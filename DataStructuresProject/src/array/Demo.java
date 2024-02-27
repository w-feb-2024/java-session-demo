package array;

public class Demo {

	public static void main(String[] args) {
		DynamicArray array = new DynamicArray(3);
		array.insert(10);
		array.insert(50);
		array.insert(30);
		array.insert(70);
		array.insert(20);
		array.insert(25);
		array.insert(27);
		
		System.out.println(array);
		System.out.println(array.isEmpty());
		System.out.println(array.size());
	}

}
