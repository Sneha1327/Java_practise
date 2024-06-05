package day25.ScannerClass.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementSorting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of Array");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		for(int i=0; i<length; i++) {
			System.out.println("Enter Element "+ (i+1)+ " : ");
			arr[i] =sc.nextInt();			
		}
		Arrays.sort(arr);
		System.out.println("sorted Array: ");
		for(int i=0; i<length; i++) {
			System.out.print(arr[i]+ " ");
					
		}

	}

}
