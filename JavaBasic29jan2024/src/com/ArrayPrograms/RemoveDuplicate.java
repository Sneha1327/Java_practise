package com.ArrayPrograms;
import java.util.Arrays;
public class RemoveDuplicate {
	static int removeDuplicate(int[] ar) {
		int rd=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[rd]!= ar[i]) {
				rd++;
				ar[rd]= ar[i];
			}
		}
		return rd+1;
	}

	public static void main(String[] args) {
		int[] ar = new int[] {2,3,2,5,3,6,4,6,2,4};
		System.out.println("Original Array");
		for(int num : ar) {
			System.out.print(num+" ");
		}
		System.out.println();
		Arrays.sort(ar);
		System.out.println("sorted Array");
		for(int num : ar) {
			System.out.print(num+" ");
		}
		System.out.println();
		int rd=removeDuplicate(ar);
		System.out.println();
		for(int i=0; i<rd; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

}
