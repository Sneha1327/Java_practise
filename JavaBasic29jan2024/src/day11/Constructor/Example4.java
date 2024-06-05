package day11.Constructor;

public class Example4 {
	//user defined constructor
		Example4(){
			System.out.println("I am no-param cons of Example4...");
			age=25;
		}
		Example4(int x){
			System.out.println("I am int-param cons of Example4...");
			age=x;
		}	
		public static void main(String[] args) {
			Example4 ref=new Example4();		
			ref.display();
			ref.age=15;
			System.out.println("age with ref object: "+ref.age);
			Example4 ref2=new Example4(50);		
			ref2.display();
			System.out.println("age with ref2 object: "+ref2.age);
		}
		int age;//nonstatic global variable
		void display() {//nonstatic method
			System.out.println("Hi, I am display method of Exampe4 class, age is "+age);
		}
}
