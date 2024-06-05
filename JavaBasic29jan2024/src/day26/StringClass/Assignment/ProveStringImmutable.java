package day26.StringClass.Assignment;

public class ProveStringImmutable {
	public static void referenceCheck(Object x, Object y) {
		if(x==y) {
			System.out.println("Both pointing to the same reference");
		}else {
			System.out.println("Both pointing to the different reference");
		}
		
	}


	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		

	}

}
