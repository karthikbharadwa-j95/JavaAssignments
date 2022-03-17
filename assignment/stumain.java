//package com.te.collections.assignment;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class stumain {
//
//	public static void main(String[] args) {
//		ArrayList<CompareStudent> arrayList = new ArrayList<CompareStudent>();
//		arrayList.add(new CompareStudent(100, "karthik", "Mysuru", 69));
//		arrayList.add(new CompareStudent(150, "Bhargav", "BEL", 42));
//		arrayList.add(new CompareStudent(340, "Bharath", "Hebbal", 35));
//		arrayList.add(new CompareStudent(354, "Jaison", "Kathriguppe", 65));
//
//		System.out.println("================================================");
//
//		do {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Press 1 to sort by Id");
//		System.out.println("Press 2 to sort by Name");
//		System.out.println("Press 3 to sort by Location");
//		System.out.println("Press 4 to sort by Marks");
//		int x = scanner.nextInt();
//
//		switch (x) {
//		case 1:
//			Collections.sort(arrayList, new CompareByStudentId());
//			for (CompareStudent Student : arrayList) {
//				System.out.println(Student);
//			}
//
//			break;
//
//		case 2:
//			Collections.sort(arrayList, new CompareByStudentName());
//			for (CompareStudent Student : arrayList) {
//				System.out.println(Student);
//			}
//
//			break;
//
//		case 3:
//			Collections.sort(arrayList, new CompareByStudentLocation());
//			for (CompareStudent Student : arrayList) {
//				System.out.println(Student);
//			}
//
//			break;
//
//		case 4:
//			Collections.sort(arrayList, new CompareByStudentMarks());
//			for (CompareStudent Student : arrayList) {
//				System.out.println(Student);
//			}
//
//			break;
////		default:
////			System.out.println("Please enter the number between 1 to 4");
////			continue;
//		}
//
//		Scanner scanner1 = new Scanner(System.in);
//		System.out.println("Press Y to continue to Main options else press N");
//		String str = scanner1.next();
//		if (str.equalsIgnoreCase("Y")) {
//			switch (x) {
//			case 1:
//				Collections.sort(arrayList, new CompareByStudentId());
//				for (CompareStudent Student : arrayList) {
//					System.out.println(Student);
//				}
//
//				break;
//
//			case 2:
//				Collections.sort(arrayList, new CompareByStudentName());
//				for (CompareStudent Student : arrayList) {
//					System.out.println(Student);
//				}
//
//				break;
//
//			case 3:
//				Collections.sort(arrayList, new CompareByStudentLocation());
//				for (CompareStudent Student : arrayList) {
//					System.out.println(Student);
//				}
//
//				break;
//
//			case 4:
//				Collections.sort(arrayList, new CompareByStudentMarks());
//				for (CompareStudent Student : arrayList) {
//					System.out.println(Student);
//				}
//
//				break;
////			default:
////				System.out.println("Please enter the number between 1 to 4");
////				continue;
//			}
//
//		} 
//		}while(str.equalsIgnoreCase("N")) {
//			System.exit(0);
//			System.out.println("program got terminated");
//
//		}
//
//		}
//	}
//}
//


