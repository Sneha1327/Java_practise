package day13.finalAndBolock;

public class BlockExample5 {
	final int age;
	final static double salary;
	public static void main(String[] args) {
		System.out.println("Welcome to main(), lets start");
		System.out.println("salary: "+salary);
		BlockExample5 e1=new BlockExample5();		
		System.out.println("age: "+e1.age);
		System.out.println("Main() ends here...");
	}	
	//NSIB
	{
		System.out.println("i am NSIB-1 from BlockExample4 class");
		age=25;
	}
	//SIB
	static {
		System.out.println("i am SIB-1 from BlockExample4 class");
		salary=2500.36;
	}
}
