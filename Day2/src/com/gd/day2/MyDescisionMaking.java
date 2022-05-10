package com.gd.day2;

//Top down approach 
public class MyDescisionMaking {

	public static void main(String[] args) {

		// selective or decision making statement
		// code 1
		// code 2
		// code 3
		// code 4

		// if keyword
		// () which take only true or false
		// it is kind of switch which
		// it take the expression which evaluate as true or false
		int a = 10;
		// a>0 //variable operator zero
		// operator

		if (false)

		// block of if
		// this is true block
		{
			if (a > 0) {
				System.out.println("nested i am true block");
			} else {
				System.out.println("nested i am false block");

			}
			System.out.println("i am true block");
		} else {
			if (a > 0) {
				System.out.println("nested i am true block");
			} else {
				System.out.println("nested i am false block");

			}
		}

		// else block
		// it will execute on false condition

		System.out.println("next block");

		{
			System.out.println("next else .....");
		}

		// day number and i want to print the day name
		int day = 7;
		if (day == 1) {

			System.out.println("Mon");
		} else if (day == 2) {

			System.out.println("Tue");
		} else if (day == 3) {

			System.out.println("Wed");
		} else if (day == 4) {

			System.out.println("Thu");
		} else if (day == 5) {

			System.out.println("Fri");
		} else if (day == 6) {

			System.out.println("Sat");
		} else if (day == 7) {

			System.out.println("Sun");
		} else {
           System.out.println("Enter a valid day");
		}
	}

}
