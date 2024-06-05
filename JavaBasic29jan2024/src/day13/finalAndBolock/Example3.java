package day13.finalAndBolock;

public class Example3 {
	final static int num1=10;
	final int num2;
	Example3(){
		//as non-static member will be loaded in the memory at the time of object creation
		//at that only JVM will get to know that variable is final, so we can initialize them using constructor
		//as constructor is mainly use to initialize non-static member into the object memory so
		//we can initialize non-static final variable from constructor body
		num2=25;
	}
	public static void main(String[] args) {
		System.out.println("SGV num1: "+num1);
		Example3 e1=new Example3();
		System.out.println("NSGV num1: "+e1.num2);
	}
}
/*
final: it represented as constant
	use:
		variable - local/global
		method
		class
final variable: this mean that variable can;t be re-initialized, if you will try dn you will get compile time error
	final local variable: it can be declared and initialized before use
	final global variable: it should be initialize at the time declaration itself, it won;t take default value
		but-
			final non-static global variable
				* using constructor: we can declare them and initialization can be done from inside constructor body
				* using non-static block:
			final static global variable
				* using static block:
*/