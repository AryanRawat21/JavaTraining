package com.gd.day2;

import java.util.TreeSet;

public class MyLooping {

	public static void main(String[] args) {
		
		
		
		TreeSet<MySwitch> ts=new TreeSet<MySwitch>();
		
		

		// Looping --it is used when we have to repeat some link of code again anf again

		/*
		 * int a=1; //once a lifetime
		 * 
		 * System.out.println(a); //repeating a=a+1; // add the one to last value
		 * //repeating System.out.println(a); a=a+1; System.out.println(a); a=a+1;
		 * System.out.println(a); a=a+1; System.out.println(a); a=a+1;
		 * System.out.println(a); a=a+1; System.out.println(a); a=a+1;
		 * System.out.println(a); a=a+1; System.out.println(a); a=a+1;
		 * System.out.println(a);
		 * 
		 * //for loop //intilaztion of variable //condition //inc/decrement
		 * //i,j,k,l,m,n
		 */
		// entry control loop
		// int i=0;
		/*
		 * for (int i = 1; i <= 10; i = i + 1) { System.out.println(i); }
		 */

		// entry control loop
		int i = 1;
		while (i <= 10) {
			
			
			i = i + 1;
			
			if (i == 5) 
			{
				continue; // it will skip the current iteration and start with next iteration
				
			}
			System.out.println(i);
		
		}

		// Do while
		// exit control Loops
		/*
		 * int i = 1; do { System.out.println(i); i = i + 1; } while(i <= 10);
		 */

	}

}
