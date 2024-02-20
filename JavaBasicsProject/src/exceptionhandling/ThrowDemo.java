package exceptionhandling;

import java.util.Random;

public class ThrowDemo {
	public static void main(String[] args) {
		
			ArithmeticException ae = new ArithmeticException();
			//throw ae; // used to explicitly throw an exception
			
			
			int a = 5;
			int b = 0;
			if(b != 0) {
				int c = a/b;
			}
		
	}
}
