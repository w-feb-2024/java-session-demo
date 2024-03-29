package javabasics;
import java.util.Scanner;

public class MethodDemo {

	// input - presentation layer
	// process - bussiness logic layer
	// output - presentaion layer
	
	// a progam to find the factorial of a number
	public static void main(String[] args) {
	// input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
	
	// 2. invoke the function
		
		int output = findFactorial(num);
		
	// output
		if(output == -1) {
			System.out.println("Invalid input.");
		}else {
			System.out.println("Factorial of " + num + " is " + output);	
		}
	}
	
	// process/logic
	// 1. define the method
	static int findFactorial(int number) {
		int result = 1;
		if(number < 0) {
			return -1;
		}
		else {
			for(int i=2;i<=number;i++) {
				result = result * i;
			}
		}
		return result;
		
	}

}
