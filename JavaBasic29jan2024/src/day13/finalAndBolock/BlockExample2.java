package day13.finalAndBolock;

public class BlockExample2 {
	{
		System.out.println("i am NSIB-1 from BlockExample2 class");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to main(), lets start");
		BlockExample2 e1=new BlockExample2();
		System.out.println("*************2nd Object*****************");
		BlockExample2 e2=new BlockExample2();
		System.out.println("Main() ends here...");
	}	
	{
		System.out.println("i am NSIB-2 from BlockExample2 class");
	}

	BlockExample2(){
		System.out.println("I am BlockExample2 cons....");
	}
}
