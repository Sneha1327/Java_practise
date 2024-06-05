package day28.Exception;

//No exception in program
public class ExceptionHandling7 {
	public static void main(String args[]) {
		System.out.println("Program starts from here");
		try {
			// below code do not throw any exception
			int data = 25 / 5;
			System.out.println(data);
		}catch (ArrayIndexOutOfBoundsException e) {// catch won't be executed
			System.out.println("Exception handled...");
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}