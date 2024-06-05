package day12.thisStatement;

public class Example2 {
	int age;
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 e1=new Example2();
		e1.calling(25);
		e1.calling();
		System.out.println("Program ends");
	}
	
	void calling(int age) {
		System.out.println("Local age value is: "+age);
//		Example2 e1=new Example2();
//		System.out.println("GV age value is: "+e1.age);
		
		System.out.println("GV age value is: "+this.age);
	}
	void calling() {
		System.out.println(" age value is: "+age);
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