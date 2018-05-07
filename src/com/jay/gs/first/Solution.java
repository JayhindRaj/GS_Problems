package com.jay.gs.first;

import java.io.*;
import java.util.*;
public class Solution {
 
  
 public static void main(String[] s) {
  
   int test1[]={42, 4,-1, 23, 11, 5, 7, 23, 5, 9, 7 };
   int test2[]={42,3, 5,-1, 23, 11, 5, 7, 23, 5, 9, 9 };
   int test3[]={3,1,1,2,2};
   
//    if (secondSmallest(test1) == 4 
//        && secondSmallest(test2) == 3 && secondSmallest(test3) == 2) {
//      System.out.println("Tests passed");
//    } else {
//      System.out.println("Tests failed");
//    }

    
    if ( secondSmallest(test3) == 2) {
          System.out.println("Tests passed");
        } else {
          System.out.println("Tests failed");
        }
  }
   static int secondSmallest(int[] input) {
       int fs = 0, ss= 0;
     if(input != null && input.length> 0) {
      // fs = input[0];
      // ss = input[0];
       if(input[0] < input[1]) {
         fs = input[0];
         ss= input[1];
       }else {
         fs = input[1];
         ss= input[0];
       }
     
       System.out.println("fs: " + fs + ", ss: " + ss);
     for(int i = 2; i < input.length; i++) {
    
       if(input[i]<fs) {
         ss = fs;
         fs = input[i];
         System.out.println("AAA");
       } else if(input[i]<ss && input[i]>fs) {
    	   System.out.println("BBB");
         ss = input[i];
       }
       System.out.println(ss);  
    }
     
     System.out.println(ss);
     }
   
return ss;
  }

}


