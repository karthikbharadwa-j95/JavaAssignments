package com.te.javabasics.arrays;

public class LargestElement {

	public static void main(String[] args) {
		int [] arr= {25,34,7,88,99};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
			System.out.println("the largest element in the array is"+max);
		}
		
	}


