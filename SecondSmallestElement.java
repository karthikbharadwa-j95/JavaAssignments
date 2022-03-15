package com.te.javabasics.arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[]= {10,9976,100,976,100,76,76,8754};
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
		System.out.println("second smallest element is"+arr[1]);
		
//		System.out.println("-------------------------------------");
//		//logic to find the smallest number when the smallest numbers are repeated
//		for (int k = arr.length-1; k >= 0; k--) {
//			if (arr[k-1]!=arr[k]) {
//				System.out.println(arr[k-1]+"is the second smallest");
//				break;
//				
//			}
//			
//		}
	}

}