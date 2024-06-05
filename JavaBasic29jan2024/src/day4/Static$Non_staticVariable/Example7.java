package day4.Static$Non_staticVariable;

public class Example7 {
// Using non-static variable create area of circle and Simple Interest
	static float  radious, pi= 3.14f, r= 2.5f;
	static long p;
	static int t;
	static double area, Interest;
	public static void main(String[] args) 
	{
		radious= 5.6f;
		System.out.println("Program Start");
		System.out.println("PI: " +Example7.pi);
		System.out.println("Radious: "+ Example7.radious);
		Example7.area =Example7.pi*Example7.r*Example7.r;
		System.out.println("Formula: Area of circle= pi*r*r");
		System.out.println("Area of Circle: "+Example7.area);
		System.out.println("***********************");
		Example7.p= 34000l;
		Example7.t= 2;
		System.out.println("Principle: "+ Example7.p);
		System.out.println("Rate of Interest: "+ Example7.r);
		System.out.println("Time: "+ Example7.t);
		Example7.Interest = (Example7.p*Example7.r*Example7.t)/100;
		System.out.println("Formula:  Simple Interest= (p*r*t)/100");
		System.out.println("Simple Interest : "+Example7.Interest );
		System.out.println("Program end");
	}
}
