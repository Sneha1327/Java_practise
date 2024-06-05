package day10.MethodOverloading;

public class Example5 {

	public static void main(String[] args) {
		//creating object to load non-static member of the class into the object memory
				Example5 ref=new Example5();
				System.out.println("Reverse number is: "+ref.getReverseNumber(456));
				System.out.println("Reverse number is: "+ref.getReverseNumber());
			}
			
			/*
			 * WAM to get reverse number for given number
			 */
			public int getReverseNumber(int num) {
				System.out.println("Given number is "+num);
				int rev=0,rem;
				while(num!=0) {
					rem=num%10;
					rev=rev*10+rem;
					num=num/10;
				}
				return rev;
			}	
			public int getReverseNumber() {
				int num=123;
				System.out.println("Given number is "+num);
				int rev=0,rem;
				for(;num!=0;num=num/10) {
					rem=num%10;
					rev=rev*10+rem;
				}
				return rev;
	}

}
