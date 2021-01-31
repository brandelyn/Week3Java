package week3Java;

import java.util.Scanner;

public class ObjectsNotes {

	public static void main(String[] args) {
		
		//primitive data types vs objects 
		//primitive is just a piece of data 
		//objects are an array or String or Scanner
		//all objects beside a String your going to use the new
		
		int age = 34; //primitive data type, all primitives are lower case and objects start uppercase
		
		String name = "Sally Mae"; // object data type, it has properties & methods 
		System.out.println(name.length());//any time you call a method you have to have ()
		System.out.println(name.charAt(6));
		
		Scanner s = new Scanner(System.in);
		
		int[] numbers = new int[3];
		System.out.println(numbers.length);
		
		//javadocs is like a java library
		
		

	}

}
