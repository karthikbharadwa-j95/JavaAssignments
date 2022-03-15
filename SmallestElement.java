package com.te.javabasics.arrays;

public class SmallestElement {

	public static void main(String[] args) {
		int [] arr= {253,384,7,888,909};
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
			System.out.println("the smallest element in the array is"+min);
		}
		
	}

