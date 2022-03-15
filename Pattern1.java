package com.te.javabasics.common;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
}
