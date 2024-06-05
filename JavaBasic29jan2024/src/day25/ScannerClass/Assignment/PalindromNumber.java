package day25.ScannerClass.Assignment;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int temp = num;
		int rev= 0, rem;
		for(; num>=1; num=num/10) {
			rem= num%10;
			rev = rev*10 +rem;
		}
		if(temp==rev) {
			System.out.println("This Number is palindrom number");
		}else{
			System.out.println("This Number is not a palindrom number");
		}
			
		
	}

}
