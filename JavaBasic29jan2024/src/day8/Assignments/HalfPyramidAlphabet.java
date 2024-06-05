package day8.Assignments;

public class HalfPyramidAlphabet {

	public static void main(String[] args) {
		 char ch= 'Z';
	        for(int i = 1; i <= 5; ++i) {
	            for(int j = 5; j >= i; --j) {
	                System.out.print(ch+ " ");
	            }
	            System.out.println();
	            --ch;    
	        }

		
	}

}
