package day3;

class Calcu{
	//method overloading
	void add(int a, int b) {
		System.out.println("a + b is "+(a+b));
	}
	void add(int a, int b, int c) {
		System.out.println("a+ b + c is"+(a+b+c));
	}
	
	void greet() {
		System.out.println("these is for greeting message");
	}
}

class Another extends Calcu{
	@Override
	void greet() {
		System.out.println("these is for greeting message from another class");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Calcu c = new Calcu();
		c.add(2, 3);
		c.add(3, 5, 5);
		c.greet();
		Another a = new Another();
		a.greet();
	}
}
