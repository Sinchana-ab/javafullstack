package day2;

public class LoopingStatement {
	public static void main(String[] args) {
		int[] array  = {1,2,3,4};
		//array.length
		/*
		 * for(initial;condition;icreament/decrement){
		 * 
		 * }*/
		//0 => n-1;<=n-1 <n 4<4=> 4 =4
//		for(int i = 0;i< array.length;i++) {
//			System.out.println(i+""+array[i]);
//		}
		
		
		
		int i =0;
		while(i<array.length) {
			System.out.println(i+""+array[i]);
			i++;
		}
		int n =1;
		do {
			
			System.out.println("do while");
			System.out.println(n);
		}while(n>=2);
		
		System.out.println("for each");
		for(int n1: array) {
			System.out.println(n1);
		}
	}
}
