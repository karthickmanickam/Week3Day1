package org.overloading;
public class Students {
	public void getStudentInfo(int id) {
		System.out.println("This is the Student Id: " +id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("This is the Student Id: " +id +"and Studen Name: " +name);
	}
		public void getStudentInfo(String email, long phonenumber) {
		System.out.println("This is the Student emaild: " +email +" and Phonenumber: " +phonenumber);
	}
		public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(102030);
		obj.getStudentInfo(102030,"Name");
		obj.getStudentInfo("email@gmail.com", 9999999999L);
	}
}
