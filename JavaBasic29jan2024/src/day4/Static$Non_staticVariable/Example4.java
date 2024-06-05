package day4.Static$Non_staticVariable;

public class Example4 {
	int num1,num2=30;
	double res;
	public static void main(String[] args) 
	{
		//Example4 ref;
		//ref=new Example4();
			//or
		Example4 ref=new Example4();
		System.out.println("number1: "+ref.num1);
		System.out.println("number2: "+ref.num2);
		System.out.println("result: "+ref.res);
		ref.res=ref.num1+ref.num2;
		System.out.println("updated result: "+ref.res);
	}
}
/*
declared without statis keyword
instance/object member, they are loaded in the memory at the time of object creation that is runtime/execution
they will have multiple memory allocation based on object creation
"we can access them using two ways
1. directly from any non-static method/constructor
2. using object(STD)

classname ref=new classname();

System.out.println(ref.salary);
ref.salary=45000.56;"
"Object- is a real world entity which has some state and behavior

classname ref;//object declaration
ref=new classname();//object initialization

or 

classname ref=new classname();"



*/
