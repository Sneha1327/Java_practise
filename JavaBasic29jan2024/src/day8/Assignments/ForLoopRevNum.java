package day8.Assignments;

public class ForLoopRevNum {

	public static void main(String[] args) {
		
		int i=456654, temp=i;
		System.out.println("Original number is "+i);
		 int rev=0, rem;
		 while(i!=0) {
			rem=i%10;
			rev= rev*10+rem;
			i=i/10;
		 }
		 System.out.println("reverse number is: "+rev);
		 
		 if(temp==rev) {
			 System.out.println("Given number is palin");
		 }else {
			 System.out.println("Given number is not a palin");
		 }
	}

}
