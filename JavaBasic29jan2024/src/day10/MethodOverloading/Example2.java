package day10.MethodOverloading;

public class Example2 {

	public static void main(String[] args) {
		int n1=21;
		System.out.println("Given number is: "+n1);
		//you won't get method return value in the console
		checkEvenNumber(n1);
		//you will be able to print return value of the method in the console
		System.out.println("is given number even? "+checkEvenNumber(n1));
		//if you want to keep return value for future use
		boolean result=checkEvenNumber(24);
		System.out.println(result);
		
		//body will be executed but you won;t get its return value
//		getSimpleInterest(550000, 8.5, 5);
//		//body will be executed and also return value will be printed in the console
//		System.out.println("Interest is: "+getSimpleInterest(550000, 8.5, 5));
		//body will be executed and its return value will be stored in a variable for future use
		double res=getSimpleInterest(550000, 8.5, 5);
		System.out.println("Interest amount is: "+res);
		double finalAmount=550000+res;
		System.out.println("Final amount will be: "+finalAmount);
	}
	
	static double getSimpleInterest(int p,double r,int t) {
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI is: "+r);
		System.out.println("Duration is: "+t);
//		double res=(p*r*t)/100;
//		return res;
			//or
		return (p*r*t)/100;
	}
	
	static boolean checkEvenNumber(int num) {
		boolean res;
		if(num%2==0) {
			res=true;
		}else {
			res=false;
		}
		return res;

	}

}
/*
Method parameter helps us to run each time with diff values

WAP to check given number is even or not

method with return type can to called in following ways
	1. directly --> no return value will be printed
	2. inside println() --> return value will be printed in the console
	3. return value stored in variable based method return type, dn you can use return value in future
*/