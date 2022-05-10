package com.gd.day8;

//In generic you will be passing the data type as parameters 
//hold the data type
//these data type will be use to declare the variable
class Employee<T, Y, Z> {

	T id;
	Y name;
	Z salary;

	public Employee(T id, Y name, Z salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setId(T id)
	{
	 this.id=id;	
	}
	
	public T getID()
	{
		return this.id;
	}
	
	
	public void print()
	{
		System.out.println("id is "+this.id);
		System.out.println("name is "+this.name);
		System.out.println("salary is "+this.salary);
	}

}

public class MyGenericClass {

	public static void main(String[] args) {

		Employee<Integer ,String,Float> emp = new Employee<Integer ,String,Float>(1001, "Ajay", 10.0f);
         emp.print();
		Employee<Integer ,String,String> emp2 = new Employee<Integer,String,String>(1001, "Ajay", "1000.0");
		System.out.println("==================================");
		emp2.print();
		
		Employee<Integer ,Integer,Integer> emp3 = new Employee<Integer,Integer,Integer>(1001, 1000, 1000);
		System.out.println("==================================");
		emp2.print();
		
		
	}
}
