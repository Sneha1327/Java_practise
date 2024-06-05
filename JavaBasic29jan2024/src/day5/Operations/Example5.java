package day5.Operations;

public class Example5 {

	public static void main(String[] args) {
		int a=10,b;
		b=a + a++ + a + ++a;
//initial=10+ 10  + 11 + 12
//final  =10  11	11	 12
		System.out.println("a= "+a);//12
		System.out.println("b= "+b);//43
	}

}
