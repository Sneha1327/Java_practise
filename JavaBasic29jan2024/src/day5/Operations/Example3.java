package day5.Operations;

public class Example3 {

	public static void main(String[] args) {
		int x=10,y;
		y=x;
		System.out.println(x);
		System.out.println(y);
		y=x++;//post-increment - first use the value dn perform the opn
		System.out.println(x);//11
		System.out.println(y);//10

		y=++x;//pre-increment - first opn dn use the updated value
		System.out.println(x);//12
		System.out.println(y);//12

	}
 
}
