package com.gd.day5;

class PersonA {
	String name;

	PersonA(String name) {
		this.name = name;
	}

	public void PersonPrint() {
		System.out.println(this.name);
	}
}

class StudentA extends PersonA {
	String studentID;

	StudentA(String studentID, String name) {
		super(name);
		this.studentID = studentID;
	}

	public void StudentPrint() {
		System.out.println(this.studentID);
	}
}

//this is not supported in java 
class EmployeeA extends PersonA{
	String employeeID;

	EmployeeA(String employeeID, String name) {
		super(name);
		this.employeeID = employeeID;
	}

	public void EmployeePrint() {
		// calling the method using supper keyword
		super.PersonPrint();
		// calling the variable using super keyword
		// super.name;
		System.out.println(this.employeeID);
	}
}

public class MyHierarchical {
	public static void main(String[] args) {

		EmployeeA ankur = new EmployeeA("1001", "ankur");
		StudentA kumar = new StudentA("1", "ankur");

		ankur.PersonPrint();
		ankur.EmployeePrint();

		kumar.PersonPrint();
		kumar.StudentPrint();

	}
}
