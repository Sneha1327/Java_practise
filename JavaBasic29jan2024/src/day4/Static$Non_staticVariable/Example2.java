package day4.Static$Non_staticVariable;

public class Example2 {

	
		static int num1,num2=30;
		static double res;
		public static void main(String[] args) 
		{
			System.out.println("number1: "+Example1.num1);
			System.out.println("number2: "+Example1.num2);
			System.out.println("result: "+Example1.res);
			Example1.res=Example1.num1+Example1.num2;
			System.out.println("updated result: "+Example1.res);

	}

}
