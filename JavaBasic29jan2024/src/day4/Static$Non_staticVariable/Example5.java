package day4.Static$Non_staticVariable;

public class Example5 {

	int num1,num2=30;
	double res;
	public static void main(String[] args) 
	{
		//Example4 ref;
		//ref=new Example4();
			//or
		Example4 ref=new Example4();
		System.out.println("number1: "+ref.num1);//0
		System.out.println("number2: "+ref.num2);//30
		System.out.println("result: "+ref.res);//0.0
		ref.num1=55;
		ref.res=ref.num1+ref.num2;//55+30
		System.out.println("updated number1: "+ref.num1);//55
		System.out.println("number2: "+ref.num2);//30
		System.out.println("updated result: "+ref.res);//85.0

		Example4 ref1=new Example4();
		System.out.println("number1: "+ref1.num1);//0
		System.out.println("number2: "+ref1.num2);//30
		System.out.println("result: "+ref1.res);//0.0
	}
	
}
//NOTE: change made in one object won't impact another object