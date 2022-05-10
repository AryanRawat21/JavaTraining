package com.gd.day7;

//It will extends only the IOException Exception
//it will exception class 
//ClassNotFoundException 
public class MyCheckedException {

	public static void main(String[] args) {
		// class.forname
		// it will take class name as input parameters and it will load the class

		// Unhandled exception type ClassNotFoundException
		try {
			Class.forName("com.gd.day7.MyDataHiding.java");
		} catch (ClassNotFoundException e) {
			//e.

		}
	}

}
