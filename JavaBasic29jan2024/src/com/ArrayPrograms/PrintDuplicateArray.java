package com.ArrayPrograms;

public class PrintDuplicateArray {

	public static void main(String[] args) {
		boolean flag= false;
		
		int [] arr= {12,34,56,12,65,34};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j= i+1; j<arr.length; j++) {
				
				if(arr[i]== arr[j]) {
					System.out.println(" Duplicate element is: "+arr[i]);
					flag= true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate Element is not found");
		}
	}

}
