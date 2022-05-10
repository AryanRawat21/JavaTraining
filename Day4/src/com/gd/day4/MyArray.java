package com.gd.day4;

import java.util.Scanner;
//insert 
//select
//delete
//update
//find a value
//find the largest number
//find the small number
//sort the array 
//sum of element of array
//Sorting 

public class MyArray {

	public static void main(String[] args) {

		// Array --it will store the same type of data
		int a[] = new int[5]; //hold the int 
		int[] b = new int[5];

		String[] str=new String[10];   //hold the string value
		float[] f=new float[10];
		
 		Employee[] emp=new Employee[10];  //hold employee type

        emp[0]=new Employee(1001, "Ravinder Kumar", 10.00, "IT");
        emp[1]=new Employee(1002, "Kumar", 10.00, "IT");
        emp[2]=new Employee(1001, "priya", 10.00, "IT");
        
		System.out.println(emp[0]);
		System.out.println(emp[1]);
		System.out.println(emp[2]);
		System.out.println(emp[4]);
		System.out.println(emp[5]);
		
		// Scanner
		Scanner sc = new Scanner(System.in);

		// add the element to array
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the value for index " + i);
			a[i] = sc.nextInt();
		}
		// using index base
		//read the element of array
		for (int i = 0; i < 5; i++) {
			System.out.println("Array value " + a[i]);
		}
		// Array Ends

	}
}
