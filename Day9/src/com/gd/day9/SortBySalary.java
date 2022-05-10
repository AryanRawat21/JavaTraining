package com.gd.day9;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		System.out.println("first object "+o1);
		System.out.println("Second object "+o2);
		
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary())
		{
			return 1;
		}
		else if(o1.getSalary()<o2.getSalary())
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}

}
