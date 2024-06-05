package com.ArrayPrograms;

public class Frequency2 {
	//for sorted elements frequency
	static void FrequencyOfElement(int[] a) {
		int freq= 1;
		int i = 1;
		System.out.println("element    frequency");
		while(i<a.length) {
			while(i<a.length && a[i] ==a[i-1]) {
				freq++;
				i++;
			}
			System.out.println(a[i-1]+ "         "+ freq);
		freq = 1;
		i++;
		}
		if(a[i-1] !=a[i-2]) {
		System.out.println(a[i-1]+ "          "+ freq);
		}
	}

	public static void main(String[] args) {
		int[] a= {12,12,4,4,5};
		FrequencyOfElement(a);
	}

}
