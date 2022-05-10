package com.gd.day6;

//there is mobile concept
//it is used to provide the abstraction
//you can add the abstract keyword 
//method by adding the abstract 
//abstract --it make the class as abstract 
// --it will have only abstract method
// method are those method which have the declatration only
//abstract with the interface
//abstract with the class abstract class 

abstract interface Mobile {

	// in mobile you can call abstract public void calling();

	// you can send SMS abstract public void sendSMS();

	// Abstract methods do not specify a body
	public void calling();

	public void sendSMS();
}

// implements keyword is used to implement the interface -> class class
class Apple implements Mobile {

	@Override
	public void calling() { // TODO Auto-generated method stub
		System.out.println("calling from apple");
	}

	@Override
	public void sendSMS() { // TODO Auto-generated method stub
		System.out.println("Sending sms from apple");
	}

}

class Sumsung implements Mobile {

	@Override
	public void calling() { // TODO Auto-generated method stub
		System.out.println("calling from the Sumsung mobile");
	}

	@Override
	public void sendSMS() { // TODO Auto-generated method stub
		System.out.println("sending sms the Sumsung mobile");
	}

}

// interface can be used by another class //that will provide the implenation
public class MyInterface {

	// You cannot create the object of interface //Mobile mobile=new Mobile();
	public static void main(String[] args) {

		// Mobile interface is able to hold the referance of apple call Mobile
		Mobile Iphone13 = new Apple();
		Iphone13.calling();
		Iphone13.sendSMS();

		Mobile note = new Sumsung();
		note.calling();
		note.sendSMS();

		Mobile obj = new Mobile() {

			@Override
			public void calling() {
				// TODO Auto-generated method stub
				System.out.println("calling...");
			}

			@Override
			public void sendSMS() {
				// TODO Auto-generated method stub
				System.out.println("sendSMS...");
			}};
		// Mobile abc=new ABC();
		obj.calling();
		obj.sendSMS();
	}
}
// Iphone13 }
