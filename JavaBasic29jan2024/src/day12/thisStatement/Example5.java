package day12.thisStatement;

public class Example5 {
	Example5(){
		this(15.36);
		System.out.println("I am zero-param cons...");
	}
	Example5(int num){
	age=31;
		System.out.println("I am int-param cons...");
	}
	Example5(double num){
		this(36);
		System.out.println("I am double-param cons...");
	}
	int age;
	public static void main(String[] args) {
		Example5 e3=new Example5();
		System.out.println(e3.age);
}
}
