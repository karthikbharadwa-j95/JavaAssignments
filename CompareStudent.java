package com.te.collections.assignment;

import java.util.Comparator;

public class CompareStudent {
	int studentId;
	String name;
	String location;
	int marks;

	public CompareStudent(int studentId, String name, String location, int marks) {
		this.studentId = studentId;
		this.name = name;
		this.location = location;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "CompareStudent [studentId=" + studentId + ", name=" + name + ", location=" + location + ", marks="
				+ marks + "]";
	}


}
