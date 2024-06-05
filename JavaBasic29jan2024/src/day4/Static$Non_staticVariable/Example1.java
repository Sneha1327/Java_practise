package day4.Static$Non_staticVariable;

public class Example1 {
	static int num1,num2=30;
	static double res;
	public static void main(String[] args) {
		System.out.println("number1: "+num1);
		System.out.println("number2: "+num2);
		System.out.println("result: "+res);
		res=num1+num2;
		System.out.println("updated result: "+res);

	}

}
/*
Identify= declared with static keyword
 class member because they are loaded in the memory at the time of class creation
Memory= one time memory allocation, that is at compile time
Access= "we can access them using two ways-
1. directly from any static method   
      System.out.println(salary);
      salary=45000.6;
2. using classname(STD)
       System.out.println(TypeOfVariables.salary);
       TypeOfVariables.salary=45000.6;"


*/