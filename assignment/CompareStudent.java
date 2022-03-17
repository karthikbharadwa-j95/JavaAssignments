package com.te.collections.assignment;

import java.util.Comparator;
import java.util.Objects;

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

	@Override
	public int hashCode() {
	
		return Objects.hash(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompareStudent other = (CompareStudent) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}

	




	
}
