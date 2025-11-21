package day4;

import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int c = a/b;
			
		}
		catch ( ArithmeticException e) {
			System.out.println(e);
			System.out.println("the number is not divisible by zero");
		
		}
		finally {
			System.out.println("these block will always excecute");
			 
		}
		
		System.out.println("end of the programm");
		
		}
}
