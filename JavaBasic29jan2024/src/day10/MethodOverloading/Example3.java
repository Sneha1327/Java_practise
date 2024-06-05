package day10.MethodOverloading;

public class Example3 {

	public static void main(String[] args) {
		//creating object to load non-static member of the class into the object memory
				Example3 ref=new Example3();
				System.out.println("Reverse number is: "+ref.getReverseNumber(123));
				ref.checkPalin(121);
				ref.checkPalin(456);
			}
			
			/*
			 * WAM to check given number is palindrome or not
			 */
			void checkPalin(int num) {
				System.out.println("Given number is "+num);
				int rev=0,rem,temp=num;
				while(num!=0) {
					rem=num%10;
					rev=rev*10+rem;
					num=num/10;
				}		
				if(temp==rev) {
					System.out.println("Given number is Palindrome");
				}else {
					System.out.println("Given number is not a Palindrome");
				}		
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

}
