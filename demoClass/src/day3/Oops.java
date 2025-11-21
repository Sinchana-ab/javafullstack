package day3;


class Student{
	private String name;
	private int age;
	
	
	
	public Student() {
		super();
	}
	//constructor
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Oops {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.getName());
		//s.setName("Sinchana");
		Student s = new Student("sinchana", 24);
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}
}
