package day28.Exception;

//Throwing UserDefinedException 
//class represents user-defined exception  
class ShaileshExceltion extends Exception {
	public ShaileshExceltion(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}
//Class that uses above MyException  
public class ExceptionHandling12 {

	public static void validateAge(int age) throws ShaileshExceltion {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ShaileshExceltion("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	public static void main(String args[]) throws ShaileshExceltion {
	
		System.out.println("Hello");
		validateAge(15);
		System.out.println("Rest of the code..");
	}
}

/**
throw ---> is used to throw explicit exception from a method body, it can be checked or unchecked exception
	  ---> if its a checked exception dn you have handle it by using try-catch block or you can declare that exception
	  	   in method label using throws keyword in this case where ever this method gets called in that method you need
	  	   to handle to exception in order to continue the program

*/