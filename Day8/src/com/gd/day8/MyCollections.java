package com.gd.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//Iterable of collections 

//list of element we are going to store

public class MyCollections {

	public static void main(String[] args) {

		// int[] a=new int[10];

		// searching , deletion,sort, update ,add,size

		// MAP
		// 3--->Name

		// List

		// it is same as array but it is dymanic array
		//Collections will not hold the primitive data type
		//int , float, double
		List<Integer> list = new Vector<Integer>();
		//object

		// add the element to list
		list.add(200);
		list.add(1);
		list.add(7);
		list.add(6);
		list.add(9);
		list.add(100);
		
		//sort this list based on asc and desc
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		// delete all the element of list
		// list.clear();

		// it will take the index and give the value
		System.out.println(list.get(1));

		// it will search for element and return true or false
		System.out.println(list.contains(1));

		// list.forEach(System.out::println);

		// based on the index
		list.remove(0);
		// based on the value

		list.remove((Object) 1);

		// it will return true or false
		System.out.println(list.isEmpty());

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// it will give the size of list
		System.out.println(list.size());

		//set method pass the index and value
		//list.set(0, "hello");
		
		//list.
		
		// printing the list
		// System.out.println(list);

	}

}
