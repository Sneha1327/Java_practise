package day11.Constructor;

public class Example1 {
	
	 Example1() {
		System.out.println("i am new Constructor");
		
	}
	 Example1(int x, int y) {
		System.out.println("i am new Constructor");
		i= x ;
			j= y;
		
	}

	public static void main(String[] args) {
		System.out.println("Program start");
		Example1 obj = new Example1(10,20);
		obj.addTwoNumer();
		long result=obj.addTwoNumer();
		System.out.println("Result: "+obj.addTwoNumer());
		Example1 obj1 = new Example1(12,34);
		obj1.addTwoNumer();
		long result1=obj1.addTwoNumer();
		System.out.println(" Updated Result: "+obj1.addTwoNumer());
		System.out.println("Program end");
	}
	int i,j;
	public long addTwoNumer() {
		return (i+j);
		
	}
	
}
