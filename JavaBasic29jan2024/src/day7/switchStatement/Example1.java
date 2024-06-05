package day7.switchStatement;

public class Example1 {

	public static void main(String[] args) {
		char ch='a';
		switch(ch){
			case 'a':
				System.out.println("Vowel is: "+ch);
				break;
			case 'e':
				System.out.println("Vowel is: "+ch);
				break;
			case 'i':
				System.out.println("Vowel is: "+ch);
				break;
			case 'o':
				System.out.println("Vowel is: "+ch);
				break;
			case 'u':
				System.out.println("Vowel is: "+ch);
				break;
			default:
				System.out.println("Given char is not a vowel: "+ch);
				break;
		}

	}

}
