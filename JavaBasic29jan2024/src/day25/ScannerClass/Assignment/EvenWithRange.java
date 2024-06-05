package day25.ScannerClass.Assignment;
import java.util.Scanner;
public class EvenWithRange {

	public static void main(String[] args) {
		System.out.println("Enter you initial number : ");
		Scanner ev= new Scanner(System.in);
		int start = ev.nextInt();
		System.out.println("Enter end Number: ");
		int end = ev.nextInt();
		
		System.out.println("Even numbers within given Range are: "+ start + " to "+ end);
		for(int i= start; i<= end; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
