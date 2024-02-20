package exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide:");
		c = a / b;
		// 1. in the above line JVM figures out an exception has occured
		// 2. the jvm identifies the type of exception that occured i.e ArithmeticException
		// 3. an object of ArithmeticException is created
		// 4. the exception object is thrown implicity
		// 5. and the exception is not handled  in the program
		// 6. the control moves out of the program and goes to the default handler
		// 7. and the default handler handles the exception
		System.out.println("Division over");
		System.out.println("the answer is  : " + c);

	}

}
