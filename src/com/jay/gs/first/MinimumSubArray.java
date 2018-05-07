package com.jay.gs.first;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubArray {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4};
		int[] arr1 = new int[]{1, 2, 3, 4, 9, 5};
		int[] arr2 = new int[]{1, 2, 3, -4, 7, -2};
		int[] arr3 = new int[]{1, 2, 3, 8, 5, 4};
		
//		int[] n = getMinSubArr(arr, 20);
//		int[] n1 = getMinSubArr(arr1, 80);
//		int[] n2 = getMinSubArr(arr2, 15);
//		int[] n3 = getMinSubArr(arr3, 12);
		
//		print(n);
//		System.out.println("************************");
//		print(n1);
//		System.out.println("************************");
//		print(n2);
//		System.out.println("************************");
//		print(n3);
		int[] n = new int[]{3, 2, 5, 1, 4, 6, 1, 2};
		
		System.out.println(smallestSubWithSum(n, 13));
	}

	public static void print(int[] n) {
		if(n == null) {
			System.out.println("No such sub array is possible.");
		}else {
			for(int i: n) {
				System.out.println(i );
				}	
		}
		
	}
	
	public static int[] getMinSubArr(int[] arr, int num) {
		int startIndex = 0, endIndex = 0;
		
		int largest = getLargestIndex(arr);
		System.out.println("largest:  " + largest);
		if(arr[largest] > num) {
			return new int[]{arr[largest]};
		}
		
		if(arr[largest] == num) {
			if(largest == 0) {
				return new int[]{arr[largest], arr[largest + 1]};	
			}else if(largest == arr.length - 1) {
				return new int[]{arr[largest], arr[largest - 1]};
			} else {
				return new int[]{arr[largest], arr[largest + 1]};
			}
		}
		
		if(arr[largest] < num) {
			List<Integer> li = new ArrayList<>();
			if(largest == 0) {
				startIndex = largest;
				int sum = 0;
				for(int j = largest; j < arr.length; j++) {
						sum = sum + arr[j];	
						li.add(arr[j]);
						if(sum > num) {
							endIndex = j;
							break;
						}
				}
				
				if(sum < num) {
					return null;
				}
			}
			
			if(largest == arr.length - 1) {
				startIndex = largest;
				int sum = 0;
				li.clear();
				for(int j = largest; j >= 0; j--) {
						sum = sum + arr[j];
						li.add(arr[j]);
						if(sum > num) {
							endIndex = j;
							break;
						}
				}
				
				if(sum < num) {
					return null;
				}
			}
			
			if(largest != 0 && largest != arr.length - 1) {
				startIndex = largest;
				int sum = 0;
				li.clear();
				for(int j = largest; j < arr.length; j++) {
						sum = sum + arr[j];	
						li.add(arr[j]);
						if(sum > num) {
							endIndex = j;
							break;
						}
				}
				
				if(sum < num) {
					startIndex = largest;
					if(sum < arr[largest]) {
						li.clear();	
						li.add(arr[largest]);
						sum = 0;
						sum = sum + arr[largest];
					}
//					
					for(int j = largest -1 ; j >= 0; j--) {
							sum = sum + arr[j];	
							li.add(arr[j]);
							if(sum > num) {
								endIndex = j;
								break;
							}
					}
					
					if(sum < num) {
						return null;
					}
				}
			}
			
			int[] n2 = new int[li.size()];
			
			for(int i = 0; i < li.size(); i++) {
				n2[i] = li.get(i);
			}
			return  n2;
		}
		return  null;
	}
	
	public static int getLargestIndex(int[] arr) { 
		int largestIndex = 0;
		int largest = arr[0];
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > largest) {
				largest = arr[i];
				largestIndex = i;
			}
		}
		
		return largestIndex;
	}
	
	
	 static int smallestSubWithSum(final int arr[], final int x) {
		// int c = 0;
		long st = System.currentTimeMillis();
		int n = arr.length;
		// Initialize current sum and minimum length
		int curr_sum = 0, min_len = n + 1; 

		// Initialize starting and ending indexes
		int start = 0, end = 0;
		while (end < n) {
		// c++;
		// Keep adding array elements while current sum
		// is smaller than x
		while (curr_sum <= x && end < n) {
		// c++;
		curr_sum += arr[end++];
		}

		// If current sum becomes greater than x.
		while (curr_sum > x && start < n) {
		// c++;
		// Update minimum length if needed
		if (end - start < min_len) {
		min_len = end - start;
		}

		// remove starting elements
		curr_sum -= arr[start++];
		}
		}
		long e = System.currentTimeMillis();
		// System.out.println(e - st + "::" + c);
		return min_len;
		}
}
