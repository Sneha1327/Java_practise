package day5.Operations;

public class UnaryOp {

	public static void main(String[] args) {
		int a=0, b;
		//a=1 2 3 
		//b=0 +2+3+3
			b= a++ + ++a + ++a +a;
			System.out.println(a);//3
			System.out.println(b);//8

			a= 0;
			b= a-- + --a + --a + a;
		//a=-1 -2 -3
		//b=0+-2+-3+-3
			System.out.println(a);// -3
			System.out.println(b);// -8

			a=0;
			b= --a + --a + --a +a + ++a + a++;
		//a=-1 -2 -3 -3 -2 -1
		//b=-1+ -2 +-3+ -3+ -2+ -2 
			System.out.println(a);// -1
			System.out.println(b);// -13

			a= 0;
			b= a-- + a + ++a + a++ + ++a + a++ +a;
		//a= -1 -1 0 1 2 3
		//b=0+ -1+0+ 0+ 2+ 2+3
			System.out.println(a);//3
			System.out.println(b);//6
	}

}
