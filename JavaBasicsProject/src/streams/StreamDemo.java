package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamDemo {

	// 2 types of operation can be performed on a stream
	// - intermediate operation
	//			- placed in the middle of the stream
	//			- we can have 0 or any number of intermediate operations
	// - terminal operation
	//			- placed at the last/end of the stream
	//			- the stream ends with one terminal operation
	
	public static void main(String[] args) {
		List<Integer> allNumbers = new ArrayList<>();
		allNumbers.add(10);
		allNumbers.add(70);
		allNumbers.add(20);
		allNumbers.add(40);
		allNumbers.add(90);
		allNumbers.add(30);
		
		
		
		allNumbers.forEach((item)->System.out.println(item));
		System.out.println("--------------");
		// using stream to print the numbers in the collection
		allNumbers.stream().forEach((item)->System.out.println(item));
		
		// using stream find the count of numbers less than 50
		long countOfNumbers = allNumbers.stream().filter((eachItem)->eachItem<50).count();
		System.out.println("Count of numbers less than 50 : " + countOfNumbers);
		
		// find the sum of the squares of the numbers in the collection
		
		int sum = 0;
		for(int eachNumber: allNumbers) {
			sum += (eachNumber * eachNumber);
		}
		System.out.println("Sum is : " + sum);
		
		// with streams
		Optional optionalSum = allNumbers
									.stream()
									.map((eachItem)->eachItem * eachItem)
									.reduce((item1, item2)-> item1 + item2);
		if(optionalSum.isPresent()) {
			System.out.println("Sum is : " + optionalSum.get());
		}
		
		int sum1 = allNumbers.stream().mapToInt((eachItem)->eachItem * eachItem).sum();
		System.out.println("Sum is : " + sum1);
		
		int num = 15;
		num = 40;
		print(num);
	}
	
	static void print(final int a) {
		//a = 60;
		System.out.println(a);
	}

}
