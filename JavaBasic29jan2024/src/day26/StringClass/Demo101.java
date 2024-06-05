package day26.StringClass;

public class Demo101 {

	public static void main(String[] args) {		
			String s1="Pune";// object will be created inside SCP
			String s2=new String("Pune");//only one object will be created in NSCP because SCP already have Object with value "Pune"
			System.out.println("S1 and S2 object comparision using equals() based on value: "+s1.equals(s2));//t
			System.out.println("S1 and S2 object comparision using '==' based on address: "+(s1==s2));//f
			Demo101.StringObjectWithNewKeyword();
			Demo101.StringObjectwithLiterals();
	}
	
	static void StringObjectWithNewKeyword() {
		String s1=new String("Pune");//two object will be created 1. SCP 2. NSCP
		String s2=new String("Mumbai");//two object will be created 1. SCP 2. NSCP
		String s3=new String("Pune");//only object will be created 1. NSCP
		System.out.println("s1: "+s1 );
		System.out.println("s2: "+s2 );
		System.out.println("s3: "+s3 );
		
		System.out.println("S1 and S2 object comparision using equals() based on value: "+s1.equals(s2));//F
		System.out.println("S1 and S2 object comparision using '==' based on address: "+(s1==s2));//F
	
		System.out.println("S1 and S3 object comparision using equals() based on value: "+s1.equals(s3));//T
		System.out.println("S1 and S3 object comparision using '==' based on address: "+(s1==s3));//f	
	}
	
	static void StringObjectwithLiterals() {
		String s1="Pune";
		System.out.println("String object1: "+s1);//pune
		System.out.println("String object1 char count: "+s1.length());//4
		String s2="Mumbai";
		System.out.println("String object2: "+s2);//mumbai
		System.out.println("String object2 char count: "+s2.length());//5
		
		System.out.println("S1 and S2 object comparision using equals() based on value: "+s1.equals(s2));//f
		System.out.println("S1 and S2 object comparision using '==' based on address: "+(s1==s2));//f
		
		String s3="Pune";//address will be same as s1 as its not unique
		System.out.println("S1 and S3 object comparision using equals() based on value: "+s1.equals(s3));//t
		System.out.println("S1 and S3 object comparision using '==' based on address: "+(s1==s3));//t
	}
	
}
/**
 * Following method of Object class is overrided in String class
 * toString()-->value stored in String object 
 * equals() --->compare two String objects based on values
 * == ----> compares Two String objects based on address
 */