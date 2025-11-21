package day3;

interface Shape1{
	void print1();
}
public class Interface implements Shape1 {

	@Override
	public void print1() {
		System.out.println("these interface implementation");
	}
	 public static void main(String[] args) {
		 Interface i = new Interface();
		 i.print1();
	}
}
