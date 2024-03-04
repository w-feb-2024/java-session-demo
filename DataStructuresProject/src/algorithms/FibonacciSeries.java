package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class FibonacciSeries {

	public int computeFibonacci(int n) {
		if(n<0) throw new NoSuchElementException("number is negative");
		if( n == 0 || n ==1) return n;
		
		//System.out.println("computing fib("+n+")");
		return computeFibonacci(n-1) + computeFibonacci(n-2);
	}
	
	// altered the above method to use memoization
	Map<Integer, Integer> memo = new HashMap<>();
	
	public int computeMemoizationFibonacci(int n) {
		if(n<0) throw new NoSuchElementException("number is negative");
		if( n == 0 || n ==1) return n;
		
		// see if we already have calculated fib(5);
		if(memo.containsKey(n)) {
			//System.out.println("taking from memo fib("+n+")");
			return memo.get(n);
		}
		
		//System.out.println("computing fib("+n+")");
		int result = computeMemoizationFibonacci(n-1) + computeMemoizationFibonacci(n-2);
		// memoize
		memo.put(n, result);
		return result;
	}
	
	
	public static void main(String[] args) {
		FibonacciSeries fs = new FibonacciSeries();
		System.out.println(fs.computeFibonacci(5));
		System.out.println("----------------");
		System.out.println(fs.computeMemoizationFibonacci(50));
		
	}

}
