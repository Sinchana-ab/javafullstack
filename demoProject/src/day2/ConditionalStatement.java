package day2;

import java.util.Scanner;

public class ConditionalStatement {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number");
		 //int age = sc.nextInt();
		double  marks = sc.nextDouble();
		 
		 /*if-else
		  * =========
		  * if(condition){
		  *  /statement
		  *  }
		  *	else{
		  *}
		  * 
		  * */
	
		 
//		 if(age>= 18) {
//			 System.out.println("they can vote");
//		 }
//		 else {
//			 System.out.println("they can't vote");
//		 }
		 
		 //programm
		 //write a program grade the student through marks
		 if(marks>=85) {
			 System.out.println("A grade");
		 }
		 else if(marks<85 && marks>=70) {
			 System.out.println("b grade");
		 }
		 else {
			 System.out.println("c grade");
		 }
		 int i = 0;
		 System.out.println(i);
		 System.out.println(i+1);
	}
	 
}
