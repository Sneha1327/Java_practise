package com.AssignmentOops;

class A{
	void reverseNumber() {
		int num=3256,rev=0,rem;
		System.out.println("Original Number: "+num);
		while(num>=1)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number is: "+rev);
		
	}
}
 class B extends A{
	 boolean palindromeNumber() {
		 int num=1221,rev=0,rem,temp;
			temp=num;
			boolean res;
			System.out.println("Original Number: "+num);
			for(;num>=1;num=num/10)
				
			{
				rem=num%10;
				rev=rev*10+rem;
				
			}
			System.out.println("Reverse Number is: "+rev);
			
			if(temp==rev) {
				System.out.println("Given number is palin");
				res=true;
			}else {
				System.out.println("Given number is not a palin");
				res= false;
			}
		 return res;
	 }
	 
 }
 class C extends B{
	 boolean leapYear() {
		 int year=2022;
		 boolean result;

	//if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))
	if(year % 4 ==0){
	System.out.println("LEAP YEAR");
	result= true;
	}
	else{
	System.out.println("not a Leap YEAR");
	result=false;     
	}
		 return result;
	 }
 }


public class OopsLogic {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
