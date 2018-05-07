package com.jay.gs.first;

public abstract class FibonacciTest {

	public static void main(String[] args) {
		System.out.println(getFibonacci(10));
		System.out.println(fib(10));
	}

	/**
	 * Iterative method.
	 * 
	 * @param n
	 * @return
	 */
	public static int getFibonacci(int n) {
		int a = -1;
		int b =1;
		int c = 0;
		
		int i = 1;
		while(i <= n+1) {
			c= a+b;
			a = b;
			b = c;
			i++;
		}
		return c;
		
	}
	
	/**
	 * Recursive method.
	 * @param n
	 * @return int
	 */
	static int fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
