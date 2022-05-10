package com.gd.day7;

//final : it make the class , method and variable as final

//final class--class cannot be extends
//final variable --you cannot change the value of variable
//final method-- override will not be allowed 

//this class is final now

final class A {

	 final int a = 10;

	public void print() {
		System.out.println("Class A accesssed " + a);
	}

}

class B extends A {

	public void print() {

		System.out.println("Class B accessed " +a);
	}
}

public class FinalKeyword {
	public static void main(String args[]) {
		B mango = new B();
		mango.print();
	}

}