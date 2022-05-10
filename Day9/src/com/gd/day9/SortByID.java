package com.gd.day9;

import java.util.Comparator;
//in comparable there is comparaTO
             //it takes one parameters 
             //no need to pass the class object of comparable with the sort method
//Comparator===>compare
              //two parameters 
public class SortByID implements Comparator<Employee> {

	// you will get the compare method
	// it takes two parameters
	// we can compara these two object with given key
	@Override
	public int compare(Employee obj1, Employee obj2) {
		// TODO Auto-generated method stub

		if (obj1.getId() > obj2.getId()) {
			return 1;
		} else if (obj1.getId() < obj2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}
