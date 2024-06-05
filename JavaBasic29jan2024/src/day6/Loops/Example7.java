package day6.Loops;

public class Example7 {

	public static void main(String[] args) {
		int i=1;
		System.out.println("********Using while*************");
		while(i<5){
			System.out.println("Number with while "+i);
			i++;
		}

		System.out.println("********Using do while*************");
		do{
			System.out.println("Number is "+i);
			i++;
		}while(i<5);
	}

}
