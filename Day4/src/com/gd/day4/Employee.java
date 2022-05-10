package com.gd.day4;
import java.lang.*;

//All the java is part of OBJECT class 
//every class has object as parent class 
//POJO--plain old java object 


//create 5 pojo class of your choice 


public class Employee extends Object  {

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptid=" + deptid + "]";
	}

	public Employee(int id, String name, double salary, String deptid) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptid = deptid;
	}

	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public Employee()
	{
		
	}
	String name;
	double salary;
	String deptid;
	
	//default method
	//inbuild method
	//it come in jvm
	//public void 
	
	
	public static void main(String[] args) {
		
		//class name      object name      //new  constructor
		Employee         employee       =    new Employee(1,"ravinder",10.00,"IT");
		Employee         employee2       =    new Employee(2,"Aryan",20.00,"IT");
		Employee         employee3      =    new Employee(1,"Taiyab",10.00,"SALE");
		
		
		//
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3);
		 //employee2=employee;
		  
		//it is used to compare two object
		//both the object are equal it will return true
		//if both the object are not not equal it will return false
		System.out.println(employee.equals(employee2));
		
		//this will print the hashcode 
		//it is unique code when the object is created 
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		System.out.println(employee.toString());
	
	}
}
