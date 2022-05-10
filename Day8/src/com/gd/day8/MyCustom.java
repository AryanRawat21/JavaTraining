package com.gd.day8;

import java.util.Scanner;

//try and catch block  --it is used the handle the exception
//there can be multiple try and catch block in the method
//throws  -it is used the throws the at method level
//throw  --it is used to throw the exception 

//i am allowed to added only positive number
class OnlyPositiveNumber extends Exception {

	public OnlyPositiveNumber(String msg) {
		super(msg);
	}

}

public class MyCustom {
	// throws and exception name
	// sending the exception to JVM
	public static void main(String[] args) {

		task();

	}

	public static void task() {
		String str = null;
		// System.out.println(str.charAt(10));
		try {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			if (num < 0) {
				OnlyPositiveNumber obj = new OnlyPositiveNumber("Enter only Positive Number");
				throw obj; // using throw keyword throwing the exception
			}

			// catching the exception
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
