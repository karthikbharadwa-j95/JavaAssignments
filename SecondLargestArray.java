package com.te.javabasics.arrays;

public class SecondLargestArray {

	public static void main(String[] args) {
		int arr[]= {10,9976,100,976,8754};
		int size = arr.length;
		for(int i=0;i<size;i++) {
			for (int j = i+1; j < size; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("second largest element is"+arr[size-2]);
		
	}

}
