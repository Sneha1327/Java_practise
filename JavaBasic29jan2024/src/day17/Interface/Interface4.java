package day17.Interface;


interface Printable1 {//100%abstract
	void print();
}
interface Showable1 {
	void print();
}
class Interface4 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		Interface4 obj = new Interface4();
		obj.print();
		Showable1 obj1 = new Interface4();//u
		obj1.print();
		Printable1 obj2 = new Interface4();
		obj2.print();
	}
}
