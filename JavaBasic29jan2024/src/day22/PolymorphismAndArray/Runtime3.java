package day22.PolymorphismAndArray;

class Car {
	int price=25000;
	void run() {
		System.out.println("running");
	}
}
class innova extends Car {
	int price =50000;
	void run123()
	{
		System.out.println("running fast at 120km");
	}
}
public class Runtime3 {
	public static void main(String args[]) {
		Car c = new innova();// inheritance-yes | upcasting-yes | overriding-no
		c.run();
		System.out.println(c.price);//
	}
}