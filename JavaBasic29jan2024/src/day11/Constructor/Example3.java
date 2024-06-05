package day11.Constructor;

public class Example3 {
	//user defined constructor
		Example3(int x){
			System.out.println("I am int-param cons of Example3...");
			age=x;
		}	
		public static void main(String[] args) {
			Example3 ref=new Example3(25);		
			ref.display();
			System.out.println("age with ref object: "+ref.age);
			Example3 ref2=new Example3(50);		
			ref2.display();
			System.out.println("age with ref2 object: "+ref2.age);
		}
		int age;//non-static global variable
		void display() {//non-static method
			System.out.println("Hi, I am display method of Exampe3 class, age is "+age);
		}
}
