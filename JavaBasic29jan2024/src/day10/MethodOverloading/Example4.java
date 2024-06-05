package day10.MethodOverloading;

public class Example4 {
	
	static void main() {
		System.out.println("I am overloaded main()");
	}

	public static void main(String[] args) {
		addNumber(15.60,25);
		addNumber(150,25);
		addNumber(15,25.56);
		addNumber();
		main();
	}
	
	static void addNumber() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	static void addNumber(int num1, int num2) {
		int res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	static void addNumber(double num1, int num2) {
		double res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	static void addNumber(int num1, double num2) {
		double res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);

	}

}
/*
 * Method overloading: when we declare same method more then once in a class with diff set of parameter dn 
 * that will be known as method overloading
 * 	
 * diff set of parameter:
 * 		1.diff in no of parameter or
 * 		2.diff in type of parameter or
 * 		3.diff in position of parameter
 * 
 * why?	
 * 		with method overloading we can perform same operation is diff ways
 * 
 */


/*
Method parameter helps us to run each time with diff values

WAP to check given number is even or not

method with return type can to called in following ways
	1. directly --> no return value will be printed
	2. inside println() --> return value will be printed in the console
	3. return value stored in variable based method return type, dn you can use return value in future
*/