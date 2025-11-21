package day3;

abstract class Shape{
	void shape() {
		System.out.println("these simple ");
	}
	abstract void print();
}

class Circle extends Shape{

	@Override
	void print() {
		System.out.println("simple abstract method overide by circle class ");
	}
	
}


public class Abstraction {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.print();
		s.shape();
	}
}
