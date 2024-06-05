package day13.finalAndBolock;

public class Example2 {

	final static int num1=10;//static final variable
	final int num2=20;//non-static final variable
	public static void main(String[] args) {
		final int age = 25;//local final variable
		System.out.println("Age: " + age);
		//age = 20;
	//System.out.println("updated1, Age: " + age);
		final int empId;
		System.out.println("Hi I am example2 class");
		empId=101;
		System.out.println("empId: "+empId);
		
		System.out.println("SGV num1: "+num1);		
		//num1=25;//it can;t be re-initialized as its declared as final
		
		Example2 e1=new Example2();
		System.out.println("NSGV num2: "+e1.num2);
		//e1.num2=55;//it can;t be re-initialized as its declared as final
	}
}
