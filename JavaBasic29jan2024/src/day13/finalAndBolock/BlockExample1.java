package day13.finalAndBolock;

public class BlockExample1 {

	static {
		System.out.println("i am SIB-1 from BlockExample1 class");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to main(), lets start");
		System.out.println("Main() ends here...");
	}	
	static {
		System.out.println("i am SIB-2 from BlockExample1 class");
	}


}
/*
block:
they don't have name, return type, return value and we can;t call them based on our requirement

type:
	* static block
		static{
			//static block or SIB
		}
	* non-static block
		{
			//non-static block or NSIB
		}

SIB:
*its use to provide important information before we get into the actual login and it will automatically executed before main()
*a class can have multiple SIB's in this case all SIB will be executed in sequential order

NSIB:
*its use to provide important information before any initializing any object
*a class can have multiple NSIB's in this case all NSIB will be executed in sequential order before constructor
*/