package day26.StringClass.Assignment;

public class ReverseEachString {

	public static void main(String[] args) {
		String st= "Java Concept of the day";
		System.out.println("Original String: "+ st);
		String[] st1 = st.split(" ");
		String revStr = "";
		
	for(int i=0; i<st1.length; i++) {
		String word = st1[i];
		String revWord = "";
		for(int j= word.length()-1; j>=0;j--) {
			revWord = revWord +word.charAt(j);
			
		}
		revStr = revStr + revWord + " ";
		
	}
	System.out.println("Reverse of each String: "+revStr);
	//	System.out.println(revStr);
		

	}

}
