package day6.Loops;

public class Example3 {

	public static void main(String[] args) {
		//print even number between 5 to 20
		for(int i=5;i<=20;i++){
			if(i%2==0){
				System.out.println("Given number is even and number is: "+i);
			}
		}
		//print char from A to Z
		System.out.println("************A to Z**************");
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch+" ");
		}
		//print numbers from 10 to -5
		System.out.println("\n************10 to -5**************");
		for(int i=10;i>=-5;i--){
			System.out.print(i+ " ");
	}

}
}
