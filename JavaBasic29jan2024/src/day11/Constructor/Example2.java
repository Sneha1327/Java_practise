package day11.Constructor;

public class Example2 {
	//user defined constructor
		Example2(){
			System.out.println("I am zero-param cons of Example2...");
			age=55;
		}
		
		public static void main(String[] args) {
			Example2 ref=new Example2();		
			ref.display();
		}
		int age;//non-static global variable
		void display() {//non-static method
			System.out.println("Hi, I am display method of Exampe2 class, age is "+age);
		}
}
