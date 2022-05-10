package com.gd.day9;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

//List --it will hold the duplicate 
//Set -- will not hold the duplicate 
       //it will not maintain the order also
        //one null is allowed
public class MySet {
	public static void main(String[] args) {
         //HasSet--it will not maintain the order
		  //LinkedHashSet --it will maintain the order
		
		
		//TreeSet--it will store in sorting order
		   //null is not allowed
		Set<Employee> set=new TreeSet<Employee>(Collections.reverseOrder());
		/*
		 * set.add("Hitesh"); set.add("Abi"); set.add("Zee"); set.add("John");
		 * set.add("Kumar"); set.add("Kumar");
		 */
		//Collections.reverseOrder(set);
		//you cannot use .sort with set
		//Collections.sort(set);
		
	    //set.remove();
		
		//set.isEmpty();
		System.out.println(set);
	}
}
