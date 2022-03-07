package org.department;
import org.college.College;


public class Department extends College {
	public void deptName() {
		System.out.println("This is a Department name - Department");

	}
	public static void main(String[] args) {
		Department department = new Department();
		department.collegeName();
		department.collegeCode();
		department.collegeRank();
		department.deptName();
	}
}
