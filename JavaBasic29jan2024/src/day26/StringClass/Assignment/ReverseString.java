package day26.StringClass.Assignment;

public class ReverseString {

	public static void main(String[] args) {
		String str1 = "MumbaiPune";// output: enuPironahD
	//	char c = str1.charAt(0);
		//System.out.println("Char at index 0: " + c);

		// to print one by one character of string
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		
		}
		System.out.println();
		System.out.println("*************************");
		// to print one by one character of string from the last index
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
			
		}
		System.out.println();
		System.out.println("**************************");
		String temp = "";// "DhanoriPune";//output: enuPironahD
		for (int i = str1.length() - 1; i >= 0; i--) {
			temp = temp + str1.charAt(i);// ""+e=>e+n=>en+u=>enu
		}
		System.out.println("Original str1: " + str1);
		System.out.println("Reverse temp: " + temp);
		//System.out.println(reverseString("DhanoriPune"));

	}
	static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

}
