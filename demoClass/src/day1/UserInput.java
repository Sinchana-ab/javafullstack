package day1;

import java.util.Scanner;

public class UserInput {
	 static int n2 =10;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter your name");
		char name = sc.next().charAt(0);
		//nextLine()
		System.out.println("enter integer value");
		int n = sc.nextInt();
		System.out.println("user entered name is "+name);
		System.out.println("integer value is "+n);
		
		System.out.println(n2);
		
		//data types
		/*
		 *1. primitive datatype
		 *2.non primitive datatype
		 *
		 * A.primitive datatype
		 * ===================
		 * 1.byte
		 * 2.short
		 * 3.int
		 * 4. long
		 * 5.float
		 * 6.double
		 * 7. char
		 * 8. boolean
		 * 
		 * 
		 * B. non primitive datatype
		 * ============================
		 * 
		 * 1. arrays
		 * 2. strings
		 * 3. methods
		 * 4. object
		 * */
	}
}
