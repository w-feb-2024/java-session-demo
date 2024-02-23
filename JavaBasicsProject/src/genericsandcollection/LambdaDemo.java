package genericsandcollection;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

	public static void main(String[] args) {
		//1. to generate a random number between 0 and 100
		Supplier<Integer> randomGeneration = () -> (int)(Math.random() * 100);
		System.out.println(randomGeneration.get());
		
		//2. to find whether a number is even or odd
		Predicate<Integer> oddEven = (num) -> (num%2==0);
		System.out.println(oddEven.test(77));
		
		//3. to print a string in uppercase on the console
		Consumer<String> upper = (str) -> System.out.println(str.toUpperCase());
		upper.accept("welcome");
		
	}

}
