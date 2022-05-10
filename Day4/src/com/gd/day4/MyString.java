package com.gd.day4;

public class MyString {

	public static void main(String[] args) {

		// String class
		// it is used to store the word or line
		// insert
		// update
		// append
		// find the first char
		// convert to upper case
		// convert to lower case

		// it will heap inside string pool constant stack area
		// it is area to store the string
		// it will not have the duplicate strings

		String str = "Hello Java";

		String str2 = "Hello Java";
		// class and object
		// heap
		String str1 = new String("Hello Java");
		// it wil compare the value and type
		System.out.println(str == str1);

		str = str + " Java ";

		// method of string class

		// charAt --it will take the location index as input and return the char
		// java.lang.StringIndexOutOfBoundsException
		// when index value is not match there in string
		// System.out.println(str.charAt(50));

		str = "A";
		// it is used to compare two string
		// then first is small and second is captial it will return negative value
		// return positive if first is captial
		// if both are equal the return 0

		// 65
		// 66
		// -1

		// 66
		// 65
		// 1

		// 65
		// 65
		// 0

		System.out.println((int) str.charAt(0)); // 65
		System.out.println((int) 'D'); // 66
		// if first string is capital return positive number
		// if second string is capital return negative number
		// if both are equal return 0
		System.out.println(str.compareTo("D"));

		// it will not consider the lower and upper case
		str.compareToIgnoreCase(str1);

		// it is used to combine two string
		String str4 = str.concat(" Helllo");
		System.out.println(str.concat(" Helllo"));
		System.out.println(str);
		System.out.println(str4);

		// it will search for given char in string
		// str4.contains('l');

		System.out.println(str4.endsWith("o"));
		System.out.println(str4.startsWith("o"));

		// it is used to compare two string
		System.out.println(str.equalsIgnoreCase(str));

		byte[] b = str.getBytes();
		for (byte bb : b) {
			System.out.println((char) bb);
		}

		System.out.println(str.indexOf("A"));

		// it will check string is empty or not
		str = "Hello World";
		str.isEmpty();

		System.out.println(str.length());

		System.out.println(str.substring(3, 5));

		System.out.println(str.toUpperCase());

		System.out.println(str.toLowerCase());

		str = " hello  java ";
		System.out.println(str);
		System.out.println(str.trim());

	}

}
