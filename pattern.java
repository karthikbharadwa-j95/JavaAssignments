package com.te.javabasics.common;

public class pattern {

	public static void main(String[] args) {

		
		int r=4;
		for(int i=1;i<=r;i++) {
			int n=i;
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n=n+r-j;
			}
			System.out.println();
		}
	}
}