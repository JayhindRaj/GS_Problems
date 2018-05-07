package com.jay.gs.first;

public class VectorDotProduct {

	public static void main(String[] args) {
		String  v1 = "3i + 4j  + 1k";
		String  v2 = "3i + 4j + 1k";
		
		System.out.println("dot product of two vectors are: " + dotProduct(v1, v2));
	}

	public static int dotProduct(String v1, String v2){
		int sum = 0;
		
		String[] s1 = v1.replaceAll(" ", "").split("\\+");
		String[] s2 = v2.replaceAll(" ", "").split("\\+");
	
		for(int i = 0; i < s1.length; i++) {
			
			sum = sum +  Integer.parseInt(s1[i].substring(0, s1[i].trim().length() - 1)) * Integer.parseInt(s2[i].substring(0, s2[i].trim().length() - 1));
		}
		return sum;
	}
	
}
