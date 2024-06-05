package day12.thisStatement;

public class Example3 {
	int age;
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 e1=new Example3();
		System.out.println("Example3 ref e1: "+e1);
		e1.calling();
		System.out.println("Program ends");
	}
	void calling() {
		System.out.println(" age value is: "+age);
		System.out.println("this ref: \t"+this);
	}
}
/*
this keyword:
	its known as current class instance
	its should used only inside non-method/constructor only
	its used to access non-static members of the class
	mainly used when local variable name of non-static method/constructor is same as
	non-static global variable


*/