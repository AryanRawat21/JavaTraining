package com.gd.day7;

//Encapsulation-- we hide the method or variable which are no need to expose to real world
//data hiding also-

//private wallet
//giveMoney()
//take the money from wallet
//calculate it and give it the shopkeeper

//private Mobile

//make the variable as private 
//only the memeber variable should be able to access the variable 

class Person {
	private int wallet=2000;

	public void addMoney(int wallet) {

	}

	public void removeMoney(int money) {
 
		this.wallet=this.wallet-money;
		System.out.println("money is given "+money);
		System.out.println("Balance money "+this.wallet);
	}
}

public class MyDataHiding {
	public static void main(String[] args) {
   
		Person mohan=new Person();
		mohan.removeMoney(100);
		
		
	}
}
