package com.jay.gs.first;

public class ATOI {

	public static void main(String[] args) {
		
//			System.out.println(asciiToInt("jayhind"));
//			System.out.println(asciiToInt("Rajpoot"));
			System.out.println(asciiToInt("45312"));
			System.out.println(asciiToInt("45312.5"));
//			System.out.println(asciiToInt("j124ja"));
			

	}

	public static int asciiToInt(String str) {
		int i = 0;
//			i = Integer.parseInt(str);
			
			for(int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if(Character.isAlphabetic(c)) {
					throw new IllegalArgumentException("Not a valid input");
				}  else {
					i = i*10 + c-'0';	
				}
				
			}
					
		return i;
	}
}
