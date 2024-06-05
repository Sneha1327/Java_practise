package day12.thisStatement;

public class Example {
	static int age;
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("GV Age value is: "+age);
		int age=25; //local variable
		System.out.println("local Age value is: "+age);
		System.out.println("GV Age value is: "+Example.age);
		System.out.println("Program ends");
	}
}
