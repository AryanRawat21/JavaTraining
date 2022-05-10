package com.gd.day8;

import java.util.ArrayList;
import java.util.List;

//Data type in Java
//id
//name
//salary
class EmployeeA {
	int id;
	String name;
	double salary;

	public EmployeeA(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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
	@Override
	public String toString() {
		return "EmployeeA [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class MyCollectionWithEmployee {

	public static void main(String[] args) {

		List<EmployeeA> ls = new ArrayList<EmployeeA>();

		ls.add(new EmployeeA(1001, "Ravinder", 10.00));
		ls.add(new EmployeeA(1002, "Maesh", 20.00));
		ls.add(new EmployeeA(1003, "Pooja", 10.000));
		ls.add(new EmployeeA(1004, "Kumar", 100000.00));

		System.out.println(ls.toString());

		// Comparable
		// Comparator

		for (EmployeeA emp : ls) {
			System.out.println("id "+emp.getId());
			System.out.println("name "+emp.getName());
            System.out.println("salary "+emp.getSalary());
		}

	}

}
