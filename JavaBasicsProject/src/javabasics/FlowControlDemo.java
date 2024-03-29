package javabasics;

public class FlowControlDemo {
	// flow control
	// 1. if statement
	// 1.a simple if
	// 1.b if..else
	// 1.c else if ladder
	// 1.d nested if
	// 2. switch case statement

	// looping statement
	// 1. while loop
	// - entry control loop
	// 2. do..while loop
	// - exit control loop
	// 3. for loop
	// 4. enhanced for loop

	// a. initial value while starting the loop
	// b. condition to exit the loop
	// c. expression to increment/decrement
	public static void main(String[] args) {
		char ch = 'e';
		String result = null;
		switch (ch) {
		case 'a', 'e', 'i', 'o', 'u':
			result = "a vowel";
			break;
		default:
			result = "not a vowel";
		}
		System.out.println(ch + " is " + result);

		String day = "friday";
		String result1 = "";
		switch (day) {
		case "monday", "tuesday", "wednesday", "thursday", "friday":
			result1 = "a weekday";
			break;
		case "saturday", "sunday":
			result1 = "not a weekday";
			break;
		default:
			result = "not a valid day";
		}
		System.out.println(day + " is " + result1);

		int n = 20;
		int i = 1;
		while (i<=n) {
			System.out.println(i);
			i++;
		}
		
		int j = 1;
		do {
			System.out.println(j);
			j++;
		}while(j>=n);
		
		
		for(int l=1, m=20;m>=1;l++,m--)
			System.out.println(l + " - " + m);

		
		for(int x=0;x<5;x++);
			System.out.print("hello");
	}

}
