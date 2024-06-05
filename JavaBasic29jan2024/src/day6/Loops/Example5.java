package day6.Loops;

public class Example5 {

	public static void main(String[] args) {
		char ch='Z';
		while(ch>='A'){
			System.out.print(ch+" ");
			ch--;
		}
		System.out.println("\n*************Even number between 7 to 35 ******************");
		int i=7;
		while(i<=35){
			if(i%2==0){
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
