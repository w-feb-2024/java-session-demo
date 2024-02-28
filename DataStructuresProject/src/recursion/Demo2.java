package recursion;

import java.util.Scanner;

//write a recursive function to print n to 1
//write a recursive function to print sum of n numbers

public class Demo2 {
	// write a recursive function to print hello n times
//	
//	void print(int number) {
//		if(number == 0) return;
//		System.out.println("hello");
//		number--;
//		print(number);
//	}
	public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);    
      }
	
	public static int calculateSumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calculateSumRecursive(n - 1);
        }
	}
        
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the times:");
		int n = scan.nextInt();
		
		Demo2 demo = new Demo2();
		//demo.print(n);
		 System.out.println(calculateSumRecursive(n));
		
	}

}
