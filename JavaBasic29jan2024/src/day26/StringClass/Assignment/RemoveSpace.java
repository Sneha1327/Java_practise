package day26.StringClass.Assignment;

public class RemoveSpace {

	public static void main(String[] args) {
		 String s1= "H e ll o  j a v a   ";
		
		 //remove all white Spaces from String
		 String s2=s1.replaceAll("\\s", "");
		// System.out.println();
		 System.out.println(s2);

	}

}
