package day21.TypeCasting;

public class PrimitiveCasting3 {

	public static void main(String[] args) {

		double myDouble = 9.78d;
		int myInt = (int) myDouble; // Manual casting: double to int//nerrowing

		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9
	}

}
