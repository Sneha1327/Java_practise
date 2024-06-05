package day5.Operations;

public class SwapNumbers {

	public static void main(String[] args) {
		int Num1= 20;
		int Num2= 30;
		System.out.println("Before Swapping");
		System.out.println("First Number= " + Num1);
		System.out.println("Second Number= " + Num2);
		// swap logic using a temporary variable

		int temp = Num1;
		Num1 = Num2;
		Num2 = temp;
		System.out.println("\nAfter Swapping");
		System.out.println("First Number= " + Num1);
		System.out.println("Second Number= "+ Num2);
	}

}
