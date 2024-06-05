package day8.Assignments;

public class IfElseFGreatestNum {

	public static void main(String[] args) {
		int num1= 10;
		int num2= 20;
		int num3= 30;
		boolean res;
		 	System.out.println("num1: "+num1);  
			System.out.println("num2: "+num2);  
			System.out.println("num3: "+num3);  
		if ((num3>num1)&&(num3>num2))//t&&t
		{
		System.out.println("num3 is greatest number");	
		}else if ((num2>num1)&&(num2>num3))
		{
		System.out.println("num2 is greatest number");
		}else 
		{
		System.out.println("num1 is greatest number");  }
		
	}

}
/*if (i>0){
sop(given number is positive);
else {
	sop()given number is negative
}
*/