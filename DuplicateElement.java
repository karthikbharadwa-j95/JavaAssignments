package com.te.javabasics.arrays;

public class DuplicateElement {

	//public static void main(String[] args) {
//		int[] arr= {1,3,8,8,3,2,2,2,8,2,9,7,4};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("the duplicate element is"+ arr[j]);
//				}
//			}
//		}
//	}
//
//}

		
		/*in order to avoid printing duplicate values more than twice or thrice
		we go with the program below*/
	public static void main(String[] args) {
		int[] arr= {1,3,8,8,3,2,2,2,8,2,9,7,4};
		for(int j=0;j<arr.length;j++) {
			int count=0;
//			String[] a;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==arr[j] && i!=j) {
					count++;
					arr[i] = '\n';
				}
			}
			if(arr[j] !='\n' && count>0) {
				System.out.println(arr[j]+" ");
			}
		}
	}
}
		