package com.jay.gs.first;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static void main(String[] args) {
		getPrimeFactors(9);
		getPrimeFactors(12);
		getPrimeFactors(1925);
		getPrimeFactors(64);
		getPrimeFactors(31);
		getPrimeFactors(4096);
		getPrimeFactors(4489);
		getPrimeFactors(73);
		getPrimeFactors(180);
		getPrimeFactors(1296);
		getPrimeFactors(1);
	}

	/**
	 * 
	 * @param number
	 */
	public static void getPrimeFactors(int number) {
		System.out.print("Prime factors of " + number);
		List<Integer> primeFactors = new ArrayList<Integer>();
		if(isPrime(number)) {
//			System.out.println(number);
			primeFactors.add(number);
//			return primeFactors;
		}
		
		int sq = (int)Math.sqrt(number);
		for (int i = 2; i <= (sq + 1);) {
			while (number > 1 && number % i == 0) {
//				System.out.print(i + ", ");
				primeFactors.add(i);
				number = number / i;
			}
			i = nextPrime(i);
		}
		System.out.print(" are: " + primeFactors);
		System.out.println();
//		return primeFactors;
	}
	
	/**
	 * Get next prime.
	 * 
	 * @param n
	 * @return
	 */
	private static int nextPrime(int n) {
		for (int i = n + 1; i < 2 * n; i++) {
			if (isPrime(i)) {
				return i;
			}
		}
		return n;
	}

	/**
	 * Check whether given number is prime or not.
	 * 
	 * @param i
	 * @return boolean
	 */
	private static boolean isPrime(int i) {
		if(i == 1) {
			return false;
		}
		
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
