package com.gd.day3;

//Public class name and file name should be equal

//one file can have multiple class in java file

//Mobile
//Car
//Student
//Employee
//One class is of your choice 
//variable at least 5
//constructor
//print method
class Person {

	private String name;
	private int age;
	private String degree;

	// variable
	// static
	// final
	// default
	// public ,private , protected , default

	// method
	// --->main method
	// ---->constructor
	// Setter and Getter method

	// setter is used to set the value
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDegee(String degree) {
		this.degree = degree;
	}

	// getter --used to get the value
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getDegree() {
		return this.degree;
	}

	// it is used to set the value
	// it will always be public
	// it will have the same name as class
	// it does not have any return type

	// constructor overloading--

	public Person(String name, int age, String degree) {

		this.name = name;
		this.age = age;
		this.degree = degree;
	}

	// constructor overloading--we will have many constructor will same name but
	// different parameters
	// it is default constructor
	// method overloading
	// constructor
	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// ---->setter and getter
	// -->public ,private , protected , default
	// static

	// method is used to get the value

	public void printAll() {

		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.degree);
	}

}

public class MyClass {

	// it is string of array
	//
	public static void main(String[] args) {

		// Person Ravinder = new Person("Ravinder", 35, "M.tech");
		Person Ravinder = new Person();
		Person one = new Person("Hello");
		Person two = new Person("Hello", 25);

		Ravinder.printAll();
	}
}
