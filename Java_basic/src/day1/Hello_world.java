package day1;

import java.util.Scanner;

public class Hello_world {
	public static void main(String[] args) {
		System.out.println("Hello world");
		//single line comment
		/*
		 * 
		 * multiple line comment
		 * 
		 * */
		
		// variable :- is a container storing the values
		//declaration - > data_type variable_name = value;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name");
		int n =10;
		String name = sc.next();
		System.out.println("enterd name is "+name);
	}
}
