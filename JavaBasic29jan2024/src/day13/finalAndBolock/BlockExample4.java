package day13.finalAndBolock;

public class BlockExample4 {
	int age;
	static double salary;
	public static void main(String[] args) {
		System.out.println("Welcome to main(), lets start");
		BlockExample4 e1=new BlockExample4();		
		System.out.println("Main() ends here...");
	}	
	//NSIB
	{
		display();//0
		System.out.println("i am NSIB-1 from BlockExample4 class");
		age=25;
		display();//25
	}
	//SIB
	static {
		calling();//0.0
		System.out.println("i am SIB-1 from BlockExample4 class");
		salary=2500.36;
		calling();//2500.36
	}
	static void calling() {
		System.out.println("I am static method calling and salary is: "+salary);
	}
	void display() {
		System.out.println("I am non-static method display and age is: "+age);
	}
}
