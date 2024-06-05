package day26.StringClass.Assignment;

import java.util.Scanner;

public class PalinString {
	static void palinStr(String str) {
		String s1= str;
		String temp = "";
		for(int i=str.length()-1; i>=0; i--) {
			temp = temp+ str.charAt(i);
		}
		if(temp.equals(s1)) {
			System.out.println("Given String is PalinDrom");
		}else {
			System.out.println("Given String is not a PalinDrom");
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1;
		System.out.println("Pleace Enter a String Value: ");
		s1= scn.next();
		palinStr(s1);
		
		

	}

}
