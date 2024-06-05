package day25.ScannerClass.Assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tem = num;
		int rem, rev = 0;
		for (; num >= 1; num = num / 10) {
			rem = num % 10;
			rev = rev * 10 + rem;

		}

		System.out.println("Reverse Number is: "+ rev);
	}

}
