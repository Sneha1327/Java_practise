package day13.finalAndBolock;

public class BlockExample3 {
	{
		System.out.println("i am NSIB-1 from BlockExample3 class");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to main(), lets start");
		BlockExample3 e1=new BlockExample3();
		System.out.println("*************2nd Object*****************");
		BlockExample3 e2=new BlockExample3();
		System.out.println("Main() ends here...");
	}	
	{
		System.out.println("i am NSIB-2 from BlockExample3 class");
	}

	BlockExample3(){
		System.out.println("I am BlockExample2 cons....");
	}
	static {
		System.out.println("i am SIB-1 from BlockExample3 class");
	}
	static {
		System.out.println("i am SIB-2 from BlockExample3 class");
	}
}
