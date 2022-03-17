package com.te.collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		boolean flag = true;
		
//		ArrayList<CompareStudent> arrayList = new ArrayList<CompareStudent>();
//		arrayList.add(new CompareStudent(100, "karthik", "mysuru", 98));
//		arrayList.add(new CompareStudent(100, "karthik", "Mysuru", 69));
//		arrayList.add(new CompareStudent(150, "Bhargav", "BEL", 42));
//		arrayList.add(new CompareStudent(340, "Bharath", "Hebbal", 35));
//		arrayList.add(new CompareStudent(354, "Jaison", "Kathriguppe", 65));
//		arrayList.add(new CompareStudent(374, "Jaison", "Kathriguppe", 65));
	
		HashSet<CompareStudent> hashSet = new HashSet<CompareStudent>();
		hashSet.add(new CompareStudent(100, "karthik", "Mysuru", 69));
		hashSet.add(new CompareStudent(150, "Bhargav", "BEL", 42));
		hashSet.add(new CompareStudent(340, "Bharath", "Hebbal", 35));
		hashSet.add(new CompareStudent(354, "Jaison", "Kathriguppe", 65));
		hashSet.add(new CompareStudent(374, "Jaison", "Kathriguppe", 65));
		hashSet.add(new CompareStudent(190, "karthik", "Mysuru", 69));
		hashSet.add(new CompareStudent(190, "karthik", "Mysuru", 69));
		
		System.out.println(hashSet);

		System.out.println("================================================");
		

		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to sort by Id");
		System.out.println("Press 2 to sort by Name");
		System.out.println("Press 3 to sort by Location");
		System.out.println("Press 4 to sort by Marks");
		int x = scanner.nextInt();
		
		
	

		switch (x) {
		case 1:
			ArrayList<CompareStudent> arrayList = new ArrayList<CompareStudent>(hashSet);
			Collections.sort(arrayList, new CompareByStudentId());
			for (CompareStudent Student : arrayList) {
				System.out.println(Student);
			}

			break;

		case 2:
			ArrayList<CompareStudent> arrayList1 = new ArrayList<CompareStudent>(hashSet);
			Collections.sort(arrayList1, new CompareByStudentName());
			for (CompareStudent Student : arrayList1) {
				System.out.println(Student);
			}

			break;

		case 3:
			ArrayList<CompareStudent> arrayList2 = new ArrayList<CompareStudent>(hashSet);
			Collections.sort(arrayList2, new CompareByStudentLocation());
			for (CompareStudent Student : arrayList2) {
				System.out.println(Student);
			}

			break;

		case 4:
			ArrayList<CompareStudent> arrayList3 = new ArrayList<CompareStudent>(hashSet);
			Collections.sort(arrayList3, new CompareByStudentMarks());
			for (CompareStudent Student : arrayList3) {
				System.out.println(Student);
			}

			break;
			default:
				System.out.println("Please enter the number between 1 to 4");
				continue;
		} 
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Press Y to continue to Main options else press N");
		String str = scanner1.next();
		if(str.equalsIgnoreCase("Y")) {
			flag = true;
		}else if (str.equalsIgnoreCase("N")) {
//			flag = false;
//			System.out.println("program got terminated");
			System.exit(0);
			
		} else {
		System.out.println("Please enter the right choice");
		}

	}while(flag);
}
}
	
