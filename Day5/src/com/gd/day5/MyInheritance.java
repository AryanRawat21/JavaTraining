package com.gd.day5;

//feed the information to the class
//constructor
//setter

//which class is inheriage the another class that is class parent 
//super
//
class Person {

	int addharCard;
	String name;
	String father_Name;
	String mother_Name;
	int age;

	public Person(int addharCard, String name, String father_Name, String mother_Name, int age) {
		this.addharCard = addharCard;
		this.name = name;
		this.father_Name = father_Name;
		this.mother_Name = mother_Name;
		this.age = age;
	}

	public void printPerson() {
		System.out.println("parent class====================");
		System.out.println(this.addharCard);
		System.out.println(this.name);
		System.out.println(this.father_Name);
		System.out.println(this.mother_Name);
		System.out.println(this.age);
	}

}

//Single level
//Use the extends keyword 
//it will extends or reuse code of another code
//member variable
//method
//which class take the properites of antoher class that is called child
//sub
class Student extends Person {

	int studentId;
	int fees;
	String subject;

	public Student(int addharCard, String name, String father_Name, String mother_Name, int age, int studentId,
			int fees, String subject) {

		// it is used calling the person class constructor
		// super keyword
		//
		super(addharCard, name, father_Name, mother_Name, age);

		// setting the value for student class variable
		this.studentId = studentId;
		this.fees = fees;
		this.subject = subject;
		// this.addharCard;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fees=" + fees + ", subject=" + subject + ", addharCard="
				+ addharCard + ", name=" + name + ", father_Name=" + father_Name + ", mother_Name=" + mother_Name
				+ ", age=" + age + "]";
	}

	public void printStudent() {
		System.out.println("child class====================");
		System.out.println(this.addharCard);
		System.out.println(this.name);
		System.out.println(this.father_Name);
		System.out.println(this.mother_Name);
		System.out.println(this.age);
	}
}

class Employee extends Student {
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", salary=" + salary + ", dept=" + dept + ", location=" + location
				+ ", studentId=" + studentId + ", fees=" + fees + ", subject=" + subject + ", addharCard=" + addharCard
				+ ", name=" + name + ", father_Name=" + father_Name + ", mother_Name=" + mother_Name + ", age=" + age
				+ "]";
	}

	public Employee(int addharCard, String name, String father_Name, String mother_Name, int age, int studentId,
			int fees, String subject, int employeeid, int salary, String dept, String location) {

		super(addharCard, name, father_Name, mother_Name, age, studentId, fees, subject);
		this.employeeid = employeeid;
		this.salary = salary;
		this.dept = dept;
		this.location = location;
	}

	int employeeid;
	int salary;
	String dept;
	String location;

	public void printEmployee() {
		System.out.println(this.employeeid);
	}
}

public class MyInheritance {

	public static void main(String[] args) {
		// it is calling the Student class constructor and pass the value
		// Student is using the super keyword to call the parent class(Person)
		// constructor
		Student ankur = new Student(10001, "ankur", "abc", "cde", 35, 1, 10000, "java");

		// able to access the method of parent class
		// calling the print method with child class object
		ankur.printPerson();

		// member variable of parent class

		System.out.println(ankur.addharCard);

		System.out.println(ankur);

		Employee employee = new Employee(10001, "ankur", "abc", "cde", 35, 1, 10000, "java", 1001, 50000, "IT",
				"Banglore");
		// person class method
		System.out.println(employee.addharCard);
		employee.printPerson();

		// student class method
		System.out.println(employee.fees);
		employee.printStudent();

		// employee class method
		System.out.println(employee.salary);
		employee.printEmployee();

	}
}
