package com.gd.day8;

import java.util.*;

public class MyArrayList {
	public static void main(String[] args) {

		// It will take array
		Vector<String> ls = new Vector<String>();
		ls.add("first");
		// ls.add(2);
		ls.add("Priya"); // ls.add(2);
		ls.add("Kumar");
		ls.add("pooja");
		ls.add("Mahesh");
		ls.add("Kumar");
		// add the element on index base
		// it will append the value on given location
		// ls.add(1, 2);

		// it will update value in given location
		// ls.set(1, 2);

		// it will take the value and return the index of value
		System.out.println(ls.indexOf("Kumar"));

		// if there are more than one matching value
		// it will always return the last matching value
		System.out.println(ls.lastIndexOf("Kumar"));

		// if you want to remove element by index base
		//ls.remove(0);
          //it will return the array of object 
		Object[] arr = ls.toArray();
		
	//	Object [] arr1=new Object[4];

	/*
	 * for (Object obj : arr) { System.out.println((String) obj); }
	 */
		//IT WILLm  add the element on the top
		//ls.push("last");
		
		//it will remove the element on top
		//ls.pop();
		
		//return the first element
	System.out.println(ls.firstElement());
		
		//return the last element
		System.out.println(ls.lastElement());
		
	
		
		//it will return the last element but not removed it
		//System.out.println(ls.peek());
		
		//ls.
		// ls.
		// Collections.sort(ls);

		// desc
		// Collections.reverseOrder()
		// Collections.sort(ls, Collections.reverseOrder());

		// System.out.println(ls);

		// for advance loop
		for (String i : ls) {
			System.out.println("item is " + i);
		}

	}
}
