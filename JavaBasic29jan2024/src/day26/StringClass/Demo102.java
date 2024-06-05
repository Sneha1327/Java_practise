package day26.StringClass;

import java.util.Scanner;

public class Demo102{

	public static void main(String[] args) {
		String name;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name:" );
		name=scn.next();
		System.out.println("My name is "+name);
		
		String s1="Pune";
		String s2=s1+"Mumbai";
		String s3=s1+123;
		String s4=s1+null;
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		System.out.println("***********************");
		String s5=s1.concat("Mumbai");
		System.out.println("s5: "+s5);
		//String s6=s1.concat(123);
		String s7=s1.concat(null);
		
		System.out.println("s7: "+s7);

	}
	static void StringFunctions2() {
		String s1=new String("Pune");//2 object | 1-SCP 2-NSCP
		System.out.println("s1 : "+s1);
		//get the object stored in String constant Pool area for this use intern()
		String s2=s1.intern();
		System.out.println("s2: "+s2);
		
		String s3="BangaloreChennaiDelhiChennai";
		System.out.println("a is replaced by X: "+s3.replace('a', 'X'));
		System.out.println("Original s3 : "+s3);
		System.out.println("Chennai is replaced by Mumbai: "+s3.replaceFirst("Chennai", "Mumbai"));
		System.out.println("Original s3 : "+s3);
		System.out.println("Chennai is replace all by Mumbai: "+s3.replaceAll("Chennai", "PUNE"));
	}
	
	static void StringFunctions() {
		String s1="I am in Pune";
		System.out.println("Actual String s1: "+s1);
		System.out.println("Char in String s1: "+s1.length());
//		System.out.println("char at index 8: "+s1.charAt(8));
//		System.out.println("char at index 5: "+s1.charAt(5));
		System.out.println("***********Print one by one char of given string**************");
		for(int i=0;i<s1.length();i++) {
			System.out.println("char at index "+i+": "+s1.charAt(i));
		}
		System.out.println("***********Reverse the given string**************");
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reverse String is "+rev);
		System.out.println("**************Print given String in lower/upper case******************");
		System.out.println("Given String in lowercase: "+s1.toLowerCase());
		System.out.println("Given String in uppercase: "+s1.toUpperCase());
		System.out.println("Actual String is : "+s1);
		System.out.println("*****************************************************");
		System.out.println("Is your string starts with 'I': "+s1.startsWith("I"));
		System.out.println("Is your string ends with 'Pune': "+s1.endsWith("Pune"));
		System.out.println("Is your string having 'am': "+s1.contains("Pune"));
		System.out.println("Is your string empty: "+s1.isEmpty());
		System.out.println("*********************SubString******************************");
		String s2=s1.substring(2);
		System.out.println("SubString from index 2: "+s2);
		String s3=s1.substring(2,9);
		System.out.println("SubString from index 2 to 9: "+s3);
		System.out.println("********************Split******************************");
		String[] str=s1.split(" ");
		for(String sr:str) {
			System.out.println(sr);
		}
		System.out.println("********************************************************");
		String[] str1=s1.split(" ",2);
		for(String sr:str1) {
			System.out.println(sr);
		}
		System.out.println("********************************************************");
		String s4="I am in Pune, I am from UP, I am working in MNC";
		String[] str2=s4.split("in");
		for(String sr:str2) {
			System.out.println(sr);
		}
		
	}
	static void StringObjectCreation() {
		String s1 = "Pune";// object will be created inside SCP
		String s2 = new String("Pune");// only one object will be created in NSCP because SCP already have Object with
										// value "Pune"
		System.out.println("S1 and S2 object comparision using equals() based on value: " + s1.equals(s2));//
		System.out.println("S1 and S2 object comparision using '==' based on address: " + (s1 == s2));//
	}

	static void StringObjectWithNewKeyword() {
		String s1 = new String("Pune");// two object will be created 1. SCP 2. NSCP
		String s2 = new String("Mumbai");// two object will be created 1. SCP 2. NSCP
		String s3 = new String("Pune");// only object will be created 1. NSCP
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);

		System.out.println("S1 and S2 object comparision using equals() based on value: " + s1.equals(s2));// F
		System.out.println("S1 and S2 object comparision using '==' based on address: " + (s1 == s2));// F

		System.out.println("S1 and S3 object comparision using equals() based on value: " + s1.equals(s3));// T
		System.out.println("S1 and S3 object comparision using '==' based on address: " + (s1 == s3));//
	}

	static void StringObjectwithLiterals() {
		String s1 = "Pune";
		System.out.println("String object1: " + s1);
		System.out.println("String object1 char count: " + s1.length());
		String s2 = "Mumbai";
		System.out.println("String object2: " + s2);
		System.out.println("String object2 char count: " + s2.length());

		System.out.println("S1 and S2 object comparision using equals() based on value: " + s1.equals(s2));
		System.out.println("S1 and S2 object comparision using '==' based on address: " + (s1 == s2));

		String s3 = "Pune";// address will be same as s1 as its not unique
		System.out.println("S1 and S3 object comparision using equals() based on value: " + s1.equals(s3));
		System.out.println("S1 and S3 object comparision using '==' based on address: " + (s1 == s3));
	}

}
/**
 * Following method of Object class is overrided in String class
 * toString()-->value stored in String object equals() --->compare two String
 * objects based on values == ----> compares Two String objects based on address
 */