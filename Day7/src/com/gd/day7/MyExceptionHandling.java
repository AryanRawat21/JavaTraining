package com.gd.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Exception--exception which break the flow of code
//it is also a class
//there will be multiple catch block with one try block
// java.lang.ArithmeticException:
//you can handle it
//try and catch block
//throws --it will not handle the exception . it will throws back to the calling method
//each class has its own exception
//String 
//Error ==error means total system down
//logical error
//compilation error
public class MyExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {

		
		//check and unchecked exception 
		//demonstrate  5 check exception
		//demonstrate  10 unchecked exception
		int a = 10;
		int b = 0;

		// rule
		// you cannot divide any value with zero
		try
		{
			int c = a / b;	
		}
		catch(ArithmeticException e)
		{
			System.out.println("it is not allowed "+e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("it is not allowed "+e.getMessage());
		}
		
		//int
		String l=new String(); 
		

		//
		// System.out.println(c);

		// Exception with string class
		// unchecked
		// java.lang.NullPointerException
		//String str = null;
		//System.out.println(str.charAt(0));

		// this is checked exception
		// it is checking the code a compile time
		
			  System.out.println("hello try block");
			FileInputStream in = new FileInputStream("D/abc.txt");
		

	}
}
