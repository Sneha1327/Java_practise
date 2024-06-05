package com.ArrayPrograms;

//import java.util.Arrays;

public class AscendingDescendingOrder {
	static void descending(int[] a) {
		int temp= 0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j]>a[i]) {
					temp= a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		}
	}
		
		static void ascending(int[] a) {
			int temp= 0;
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[j]<a[i]) {//45<23, i=3,j=4,12<56
						temp= a[i];//12
						a[i]= a[j];//23
						a[j]= temp;
					}
				}
			}
	}

	public static void main(String[] args) {
		int[] a = new int[] {23,45,12,56,98,41};
		System.out.println("Original Array");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Ascending Order");
     //  Arrays.sort(a);
		 AscendingDescendingOrder.ascending(a); 
       for(int num: a) {
    	   System.out.print(num+ " ");
       }
       System.out.println();
       System.out.println("Descending Order");
    	   AscendingDescendingOrder.descending(a); 
    	   for(int num: a) {
        	   System.out.print(num+ " ");
           } 
    	   
     
       
	}

}
