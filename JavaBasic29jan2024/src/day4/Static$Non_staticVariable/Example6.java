package day4.Static$Non_staticVariable;

public class Example6 {
	//using static variable create Area of circle and Simple Interest
	static float pi= 3.14f;
	static float radious;
	static long p;
	static float r= 2.5f;
	static int t;
	public static void main(String[] args) 
	{
		radious= 5.6f;
		System.out.println("Program Start");
		System.out.println("PI: " + pi);
		System.out.println("Radious: "+ radious);
		double area = pi*r*r;
		System.out.println("Area of Circle: "+area);
		System.out.println("***********************");
	p= 34000l;
	t= 2;
		System.out.println("Principle: "+ p);
		System.out.println("Rate of Interest: "+ r);
		System.out.println("Time: "+ t);
		double Interest = (p*r*t)/100;
		System.out.println("Simple Interest : "+Interest );
		System.out.println("Program end");
	}
}
