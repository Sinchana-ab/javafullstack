package day2;

import java.util.Scanner;

public class Array {
	
	public  int add(int a, int b) {
		return a + b;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("array length");
		int n = sc.nextInt();
		System.out.println("enter array elements");
		int[] arr = new int[n];
		//int [][] arr1 =new int[][];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<n;i++) {
			System.out.println("array at index"+i+" is "+arr[i]);
		}
		Array c = new Array();
		System.out.println(c.add(2,3));
	}
}
