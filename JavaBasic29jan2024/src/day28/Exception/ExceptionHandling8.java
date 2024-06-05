package day28.Exception;

//unhandled exception in program
public class ExceptionHandling8 {
	public static void main(String args[]) throws InterruptedException {
		try {
			System.out.println("Inside the try block");
			// below code throws divide by zero exception
			int data = 25 / 5;
			//System.exit(0);//this inform JVM as this is the last statement
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
		// can only accept Null Pointer type exception
		catch (NullPointerException e) {
			System.out.println(e);
		}
		// executes regardless of exception occured or not
		finally {
			System.out.println("I am inside finally block");
		//	int k=10/0;
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}