package day7.switchStatement;

public class Example2 {

	public static void main(String[] args) {
		int month=6;
		switch(month){
			case 1:
				System.out.println("Jan month");
				break;
			case 2:
				System.out.println("Feb month");
				break;
			case 3:
				System.out.println("Mar month");
				break;
			case 6:
				System.out.println("Jun month");
				break;
			case 10:
				System.out.println("Oct month");
				break;
			default:
				System.out.println("Invalid input ");
				break;
		}

	}

}
