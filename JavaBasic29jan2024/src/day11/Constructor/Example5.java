package day11.Constructor;

public class Example5 {
	//default constructor, will written by java compiler as this class doesn't have any user defined constructor
		public static void main(String[] args) {
			Example5 ref=new Example5();		
			ref.display();
		}
		int age;//non-static global variable
		void display() {//non-static method
			System.out.println("Hi, I am display method of Exampe5 class, age is "+age);
		}
}
