package day25.ScannerClass.Assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter your number: ");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		 int count = 0;
		 for(int i=1; i<=num; i++) {
			 
			 if(num%i==0) {
				 count++;
			 }
		 }
			 if(count==2) {
				 System.out.println(num +" is Prime");
			 }else {
				 System.out.println(num +" is not Prime");
			 }
		 }
		
	}


