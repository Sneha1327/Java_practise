package day5.Operations;

public class Example6 {

	public static void main(String[] args) {
		int a=10,b;
		b=++a + a-- + --a + a + a++;
//initial= 11 + 11  +  9  + 9 + 9
//final  = 11   10     9    9   10
		System.out.println("a= "+a);//10
		System.out.println("b= "+b);//49

	}

}
