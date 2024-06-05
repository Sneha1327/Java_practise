package day14.OopsInheritance;

//parent class
abstract class OopsConcept {
	// constructor with overloading and use of this()
	OopsConcept() {
		this('A');
		System.out.println("I am zero param cons of Oops");
	}

	OopsConcept(char ch) {
		System.out.println("I am char param  overload cons of Oops");
	}

	// global variable
	long pl = 50000;
	int time = 2;
	float roi = 7.8f;
	double SimpleInterest;

	abstract void simpleInterest(int time, float roi, long pl);

	// method with method overloading use of this keyword
	void Display() {
		System.out.println("this is Display method from abstract class");
	}

	void Display(int time) {
		this.time = time;
		System.out.println("this is Display method from abstract class");
	}
}

// child class of Company
class Practise extends OopsConcept {
	// constructor with overloading and use of this() & super()
	Practise() {
		// super();
		System.out.println("i am practice class constructor");
	}

	// Practise(int time){
	// this();
	// System.out.println("i am int constructor of Practise class");
	// }
	// method with method overloading use of this & super keyword
	public void simpleInterest(int time, float roi, long pl) {

		super.SimpleInterest = (super.pl * super.time * super.roi) / 100;
		System.out.println("Principle amout is: " + super.pl);
		System.out.println("Time Duration is: " + super.time);
		System.out.println("Rate of Interest is: " + super.roi);
		System.out.println("Simple interest is: " + super.SimpleInterest);
	}

}

public class Inheritance10 {

	public static void main(String[] args) {
		Practise ref = new Practise();
		ref.simpleInterest(2, 11.23f, 45000);
		ref.Display(3);
		ref.Display();

	}

}
