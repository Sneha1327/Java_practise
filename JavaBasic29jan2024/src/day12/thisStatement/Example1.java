package day12.thisStatement;

public class Example1 {
	Example1(){
		this(34.5);
		System.out.println("I am zero-param cons...");
	}
	Example1(int num){
	
		System.out.println("I am int-param cons...");
	}
	Example1(double num){
		this(45);
		System.out.println("I am double-param cons...");
	}

	public static void main(String[] args) {
		Example1 e3=new Example1();
	}

}
