package day8.Assignments;

public class ForLoopNegativeFactor {

	public static void main(String[] args) {
		int num = -30;
		for (int i = num; i <= -(num); i++) {
			if (i != 0) {
				if (num % i == 0) {
					System.out.println("Factor of -30: " + i);
				}
			}
		}
	}

}
