package com.te.collections.assignment;

import java.util.Comparator;

public class CompareByStudentName implements Comparator<CompareStudent> {

	@Override
	public int compare(CompareStudent stu1, CompareStudent stu2) {
		return stu1.name.compareTo(stu2.name);
	}

}
