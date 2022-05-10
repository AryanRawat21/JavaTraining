package com.gd.day9;

//Comparable
   //it is interface in java 
   //it has compareTo --it will compare two object based on the key
   //salary 
//problem ..our sorting logic is fixed with class itslef


//comparator
     //it is used to sort the value based on key
     //we implement the comparator

public class Employee  {

	private int id;
	private String name;
	private double salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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

	/*
	 * @Override public int compareTo(Employee e1) {
	 * 
	 * // for comparing we need two object // one object is passing with the
	 * employee type // other object you can access from the class with this
	 * operator
	 * 
	 * // this.getName(); // e1.getName() // compareTo // if both the string are
	 * equal this method will return the zero // if first one is greater than
	 * another it will return (+number) // if second one is greater than it will
	 * return the (-negative number)
	 * 
	 * // it is used to sort the string type //
	 * this.getName().compareTo(e1.getName());
	 * 
	 * // for number // compare the two number // greater than symbol > // if first
	 * one is greater than second return -1; // if first one is less than second
	 * return 1; // if first and second both are equal return the 0
	 * 
	 * // e1.compareTo(e2); // e2.compareTo(e3); // e3.compareTo(e4); //
	 * e5.compareTo(e); if (this.getSalary() > e1.getSalary()) { return 1; } else if
	 * (this.getSalary() < e1.getSalary()) { return -1; } else { return 0; }
	 * 
	 * }
	 */
}
