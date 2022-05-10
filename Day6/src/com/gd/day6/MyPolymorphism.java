package com.gd.day6;

//method overloading 
//one task and there are many way to do it
class Person {

	// we will have method with same name and different parameters
	public void sleep() {
		System.out.println("sleeping");
	}

	public void sleep(int time) {
		System.out.println("Sleep for time " + time);
	}

	public void sleep(int time, String location) {
		System.out.println("Sleep for time " + time + " location " + location);
	}

}
//method overridng there is common method in base class and child class
//child class will override the base class method and run it own method
class Student extends Person
{
	@Override
	public void sleep() {
		System.out.println("sleep after the class hours ");
	}
}

class Employee extends Person
{
	@Override
	public void sleep() {
		System.out.println("sleep after the office timings hours ");
	}
}



public class MyPolymorphism {

	public static void main(String[] args) {
		Person student=new Employee();
		student.sleep();
	}
}
