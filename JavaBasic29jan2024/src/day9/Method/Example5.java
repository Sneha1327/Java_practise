package day9.Method;

public class Example5 {

	public static void main(String[] args) {
		int n1=21;
		System.out.println("Given number is: "+n1);
		//you won't get method return value in the console
		checkEvenNumber(n1);
		//you will be able to print return value of the method in the console
		System.out.println("is given number even? "+checkEvenNumber(n1));
		//if you want to keep return value for future use
		boolean result=checkEvenNumber(25);
		System.out.println(result);
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
 * method with return type can to called in following ways
	1. directly --> no return value will be printed
	2. inside println() --> return value will be printed in the console
	3. return value stored in variable based method return type, dn you can use return value in future
 * 
 * 
 * */
