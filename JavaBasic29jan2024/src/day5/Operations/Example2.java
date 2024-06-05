package day5.Operations;

public class Example2 {

	public static void main(String[] args) {
		int num1=10,num2=25;
		boolean res=(num1!=num2) && (num1<num2);
		System.out.println(res);//t
		System.out.println((num1!=num2) && (num1<num2));//t
		System.out.println((num1==num2) && (num1<num2) );//f
		System.out.println((num1!=num2) || (num1<num2));//t
		System.out.println((num1==num2) || (num1<num2));//t
		System.out.println((num1==num2) || (num1>num2));//f
	}

}
