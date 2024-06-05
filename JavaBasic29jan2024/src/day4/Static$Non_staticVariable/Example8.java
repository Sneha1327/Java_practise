package day4.Static$Non_staticVariable;

public class Example8 {
	 float  radious, pi= 3.14f, r= 2.5f;
	 long p;
	 int t;
	 double area, Interest;
	public static void main(String[] args) 
	{
	Example8 obj = new Example8();
		obj.radious= 5.6f;
		System.out.println("Program Start");
		System.out.println("PI: " +obj.pi);
		System.out.println("Radious: "+ obj.radious);
		obj.area =obj.pi*obj.r*obj.r;
		System.out.println("Formula: \nArea of circle= pi*r*r");
		System.out.println("Area of Circle: "+obj.area);
		System.out.println("***********************");
		
		Example8 obj1 =new Example8();
	obj1.p= 34000l;
	obj1.t= 2;
	
		System.out.println("Principle: "+obj1.p);
		System.out.println("Rate of Interest: "+obj1.r);
		System.out.println("Time: "+obj1.t);
		obj1.Interest = (obj1.p*obj1.r*obj1.t)/100;
		System.out.println("Formula:  \nSimple Interest= (p*r*t)/100");
		System.out.println("Simple Interest : " +obj1.Interest);
		System.out.println("Program end");
	}
}
