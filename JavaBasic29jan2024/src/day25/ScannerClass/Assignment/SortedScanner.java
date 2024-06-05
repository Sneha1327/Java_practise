package day25.ScannerClass.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortedScanner {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println(" Enter length of Array");
		int length= scn.nextInt();
		
		int[] arr= new int[length];
		
		for(int i=0; i<length; i++) {
			System.out.println("index "+(i+1)+" :" );
			arr[i]= scn.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<length;i++) {
			System.out.print(arr[i]+ " ");
		}
			
		
		
	}

}
