package day6.Loops;

public class Example1 {

	public static void main(String[] args) {
		int age=18;
		char bldGrp='A';

		if(age>=18){
			System.out.println("Welcome, you are 18+");
			if(bldGrp=='A'){
				System.out.println("eligible for blood donation");
			}else{
			System.out.println("But Blood group doesn't matched, not eligible for blood donation");
			}
		}else{
			System.out.println("You are below 18 yrs, not eligible for blood donation");
		}
	}

}
