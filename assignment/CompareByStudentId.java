package com.te.collections.assignment;

import java.util.Comparator;

public class CompareByStudentId implements Comparator<CompareStudent>{

	@Override
	public int compare(CompareStudent stu1, CompareStudent stu2) {
		return stu1.studentId - stu2.studentId;
	}

}
