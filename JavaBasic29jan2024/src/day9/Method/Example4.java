package day9.Method;

public class Example4 {

	public static void main(String[] args) {
		printAddition();
		System.out.println("************************");
		printAddition();
		System.out.println("************************");
		printAddition();
		System.out.println("###########################");
		printAdditionTwoNumbers(50, 70);
		System.out.println("###########################");
		printAdditionTwoNumbers(80, 45);
	}
	
	public static void printAddition() {
		int num1=10,num2=20,res;
		res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	public static void printAdditionTwoNumbers(int num1,int num2) {//int num1=50, int num2=70
		//Method parameter helps us to run each time with diff values

		int res;
		res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}

}
/*
Method parameter helps us to run each time with diff values
*/
