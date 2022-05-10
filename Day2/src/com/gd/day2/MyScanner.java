package com.gd.day2;

import java.util.Scanner;

//Friend : Scanner 
//it is use to take the input from user 
public class MyScanner {

	public static void main(String[] args) {

		// taking the ref of object scanner
		Scanner sc = new Scanner(System.in);

		// variable

		// method
		// it will read the int value and return it
		// System.out.println("Enter int value");
		// int a = sc.nextInt();
		// System.out.println(a);

		// it will read the float value and return it
		// System.out.println("Enter float value");
		// float f = sc.nextFloat();
		// System.out.println(f);

		// it will read the float value and return it
		// System.out.println("Enter byte value");
		// byte b = sc.nextByte();
		// System.out.println(b);

		// it will read the float value and return it
		// System.out.println("Enter byte value");
		// long long1 = sc.nextLong();
		// System.out.println(long1);

		// it will read the float value and return it
		// System.out.println("Enter string value");
		//String str = sc.next();
		//System.out.println(str);

		//System.out.println("Enter string value");
		//String strLine = sc.nextLine();
		//System.out.println(strLine);

		// sc.nextBoolean();
		// sc.nextDouble();
		// sc.nextShort();
		
		
		//character 
		String str1=sc.next();
		//it has one method which will take the full world
		//ravinder
		//first char of this word
		//charAt --it will take the index and return the char
		char c=str1.charAt(0);
		System.out.println(c);
	}

}
