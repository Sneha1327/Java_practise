package day9.Method;

public class Example2 {

	public static void main(String[] args) {
		displayInfo();
		System.out.println("*********************************");
		Example2.displayInfo();
		System.out.println("##################################");
		Example2.displayInfo();
	}
	
	public static void displayInfo() {
		System.out.println("Hello, Welcome to Automation session");
		System.out.println("Hello, Welcome to Manual Testing");
		System.out.println("Hello, Welcome to Pune");

	}

}
