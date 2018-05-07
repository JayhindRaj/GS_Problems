package com.jay.gs.exceptions;

import java.util.HashMap;
import java.util.Map;

public  class ExceptionTest {

	public static void main(String[] args) {
		System.out.println(test1());
		test2();
	}

	public static void test2() {
		Map<? super Object, Integer> map = new HashMap<>();
		map.put(1, 12);
		map.put(2.0, 12);
		map.put("ABc", 12);
		map.put(true, 12);
	}

	public static int test1() {
		int i = 0;
		try {
			i++;
			int asciiValue = 57;
			int numericValue = Character.getNumericValue(asciiValue);

			System.out.println(numericValue);

			return i;
		} catch (Exception e) {
			i++;
			// return i;
		} finally {
			i++;
			System.out.println("sdfasd: " + i);
			// return i;
		}
		return i;
	}

}
