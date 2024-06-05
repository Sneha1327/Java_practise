package day25.ScannerClass;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		// addNumbers(80,60,2);
		int num1, num2, num3;
		Scanner scn =new Scanner(System.in);
		System.out.println("Please enter your 1st number:");
		num1=scn.nextInt();
		System.out.println("Please enter your 2nd number:");
		num2=scn.nextInt();
		System.out.println("Please enter your 3rd number:");
		num3=scn.nextInt();
		addNumbers(num1, num2, num3);
		System.out.println("*************Diff type of data using Scanner********************");
		boolean status;
		double salary;
		char grade;
		float roi;
		System.out.println("Please enter your status either true/false");
		status=scn.nextBoolean();
		System.out.println("status is : "+status);
		
		System.out.println("Please enter your salary");		
		salary=scn.nextDouble();
		System.out.println("Salary is : "+salary);
		
		System.out.println("Please enter your grade: ");		
		grade=scn.next().charAt(0);
		System.out.println("Grade is : "+grade);
		
		System.out.println("Please enter your home load ROI: ");
		roi=scn.nextFloat();
		System.out.println("ROI is : "+roi);
	}

	static void addNumbers(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		System.out.println("Number1: " + n1);
		System.out.println("Number1: " + n2);
		System.out.println("Number1: " + n3);
		System.out.println("Sum: " + sum);
	}
}
