package com.gd.day10;

//Lambda Expression --it is used to do the functional programming 
//top down approach 
//started with line one and execute line by line 
//functional--it execute based on methods

@FunctionalInterface
interface MySum {
	public void add(int a, int b);

}

@FunctionalInterface
interface MyLenght {
	public void length(String str);

}


public class MyLambda {

	public static void main(String[] args) {

		// int a=10;
		// int b=20;
		// before --store the value in variable

		// after lambda we are going store the method in variable
		// Rule 1 : Remove the access modifier because method will not have any scope
		// Rule 2 : remove the static keyword
		// Rule 3 : remove the return type also because method is stored in variable
		// Rule 4 : remove the method name also
		// Rule 5: add the lambda method symbol ->

		// int will store the integer type
		// need to store the lambda then it should be interface tyoe
		MySum sum = (int a, int b) -> {
			int c = a + b;
			System.out.println(c);
		};
		sum.add(10, 30);

		
		String str_input="hello";
		
		
		MyLenght lengthobj= (str)->System.out.println(str.length());
		lengthobj.length(str_input);
	}
	
	public void getLength(String str)
	{
          System.out.println(str.length());
	}
	private static void multiply(int a, int b) {
		// TODO Auto-generated method stub
		int c = a * b;
		System.out.println(c);
	}

	public static void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}
}
