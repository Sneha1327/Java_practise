package com.ArrayPrograms;
import java.util.Arrays;

public class CopyOneToAnotherArray {
	

	public static void main(String[] args) {
		// declaring a source array
		int[] copyFrom = { 1,3,5,34,56,13,21,4 };
		System.out.println("ELements count in copyFrom array: "+copyFrom.length);
		for(int i=0;i<copyFrom.length;i++) {
			System.out.print(copyFrom[i]+ " ");
		}
		// declaring a destination array
		int[] copyTo=Arrays.copyOf(copyFrom, copyFrom.length);
		System.out.println("\nELements count in copyTo array: "+copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i]+ " ");
		}

}
	}
