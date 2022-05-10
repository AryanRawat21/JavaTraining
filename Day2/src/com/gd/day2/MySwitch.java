package com.gd.day2;

public class MySwitch {
	public static void main(String[] args) {

		char day = 1;

		// switch
		switch (day) {
		case 1: 
			System.out.println("Mon");
		break;
		case 2: {
			System.out.println("Tue");
		}
		break;
		case 3: {
			System.out.println("Wed");
		}
		break;
		default: {
			System.out.println("No Day is matched");
		}
		break;
		}

	}

}
