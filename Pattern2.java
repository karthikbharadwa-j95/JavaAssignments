package com.te.javabasics.common;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i=0; i<=3;i++) {
			int a=65;
			for(int j=i;j>=0;j--) {
				System.out.print((char)(a +j)+" ");
			}
			System.out.println();
		}
	}

}
