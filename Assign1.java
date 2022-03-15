package com.te.javabasics.common;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the month");
		String month = scanner.next();
		System.out.println("enter the year");
		int year = scanner.nextInt();
		
		int DaysinMonth;
		switch (month) {
		case "Jan":
			DaysinMonth = 31;
			System.out.println(month+" "+ year + "has"+ DaysinMonth+"days\n");
			break;
		case "Feb":
			if((year % 4==0 && year % 400==0) || year % 100!=0) {
				DaysinMonth = 29;
				System.out.println(year+"is a leap year and" + month+ "has" + DaysinMonth+ "days\n");
			}
			else {
				DaysinMonth = 28;
			System.out.println(year+ "is not a leap year and" + month+ "has" + DaysinMonth+ "days\n");
			}
			break;
		case "Mar":
			DaysinMonth = 31;
			System.out.println(month+" "+ year + "\thas\t"+ DaysinMonth+"\tdays\t");
			break;
		case "Apr":
			DaysinMonth = 30;
			System.out.println(month+" "+ year + "\thas\t"+ DaysinMonth+"\tdays\t");
			break;
		case "May":
			DaysinMonth = 31;
			System.out.println(month+" "+ year + "\thas\t"+ DaysinMonth+"\tdays\t");
			break;
		case "Jun":
			DaysinMonth = 30;
			System.out.println(month+" "+ year + "\thas\t"+ DaysinMonth+"\tdays\t");
			break;
		case "Jul":
			DaysinMonth = 31;
			System.out.println(month+" "+ year + "\thas\t"+ DaysinMonth+"\tdays\t");
			break;
		case "Aug":
			DaysinMonth = 31;
			System.out.println(month+" "+ year + "\thas\t"+ DaysinMonth+"\tdays\t");
			break;
		case "Sep":
			DaysinMonth = 30;
			System.out.println(month+" "+ year + "\thas\t" + DaysinMonth+"\tdays\t");
			break;
		case "Oct":
			DaysinMonth = 31;
			System.out.println(month+" "+ year + "\thas\t"+ DaysinMonth+"\tdays\t");
			break;
		case "Nov":
			DaysinMonth = 30;
			System.out.println(month+" "+ year + "\thas\t"+ DaysinMonth+"\tdays\t");
			break;
		case "Dec":
			DaysinMonth = 31;
			System.out.println(month+" "+ year + "\thas\t"+ DaysinMonth+"\tdays\t");
			break;

		default:
			System.out.println("please enter month from jan-dec");
	}

}
}
