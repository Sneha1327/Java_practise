package day4.Static$Non_staticVariable;

public class Example3 {
	static int num1,num2=30;
	static double res;
	public static void main(String[] args) 
	{
		System.out.println("number1: "+Example3.num1);
		System.out.println("number2: "+Example3.num2);
		System.out.println("result: "+res);
		res=Example3.num1+Example3.num2;
		System.out.println("updated result: "+Example3.res);

		num1=45;
		num2=65;
		res=num1+num2;
		System.out.println("number1: "+num1);
		System.out.println("number2: "+num2);
		System.out.println("updated2 result: "+res);
}
}