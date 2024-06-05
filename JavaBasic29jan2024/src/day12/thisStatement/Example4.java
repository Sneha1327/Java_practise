package day12.thisStatement;

public class Example4 {
	Example4(){
		System.out.println("I am zero-param cons...");
	}
	Example4(int num){
		System.out.println("I am int-param cons...");
	}
	Example4(double num){
		System.out.println("I am double-param cons...");
	}
	public static void main(String[] args) {
		Example4 e1=new Example4(25.36);
		Example4 e2=new Example4();
		Example4 e3=new Example4(36);
	}
}
/*
this() statement:
	it is also know as current class instance
	it should be/must be used inside constructor body only
	it should be the first statement inside the constructor body
	its used to call another constructor of current class based on the argument

*/