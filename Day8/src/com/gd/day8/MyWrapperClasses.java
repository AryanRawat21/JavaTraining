package com.gd.day8;

//Wrapper class
//it is used to convert from primitive data type to Class data type
//int ---Integer
//float-->Float
//double --Double
//boolean -->Boolean
//
public class MyWrapperClasses {

	public static void main(String[] args) {
		//java.lang.NumberFormatException
		String str="10A";
		//i need to add this 10 to sum another int value
		             //parseint --it will take the string and return the int value
		Integer obj=Integer.parseInt(str);
		
		obj=obj+1;
		System.out.println(obj);
		System.out.println(obj.max(10, 20));
	//	obj.
		Integer ii=new Integer(0);
		Float ft=new Float(0);
		
		
	}
	
	
}
