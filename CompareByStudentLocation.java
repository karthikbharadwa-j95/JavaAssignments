package com.te.collections.assignment;

import java.util.Comparator;

public class CompareByStudentLocation implements Comparator<CompareStudent>{

	@Override
	public int compare(CompareStudent stu1, CompareStudent stu2) {
		return stu1.location.compareTo(stu2.location);
	}

}
