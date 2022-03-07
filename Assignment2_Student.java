package org.student;
import org.department.Department;
public class Student extends Department {
		public void studentName() {
		System.out.println("This is a Student Name - Student");
	}
		public void studentDept() {
		System.out.println("This is a Student Department - Student");
	}
		public void studentId() {
		System.out.println("This is a Student Id - Student");
	}
		public static void main(String[] args) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
		}
}
