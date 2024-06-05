package day11.Constructor;



public class Assignment {
	//Constructor overloading
	Assignment() {
			System.out.println("i am new Constructor");
			
		}
	Assignment(int x, int y) {
			System.out.println("i am new Constructor");
		//	i= x ;
			//	j= y;
		}
	//non-static method
	public long addTwoNumer(int i, int j) {
		return (i+j);
	}
	

		static int num1, num2, sum;
		float num4, num5, addition;
		public static void main(String[] args) {
			System.out.println("Program start");
			Assignment obj = new Assignment();
			obj.addTwoNumer(10,20);
			long result=obj.addTwoNumer(10,20);
			System.out.println("Result: "+obj.addTwoNumer(10,20));
			Assignment obj1 = new Assignment(12,35);
			obj1.addTwoNumer(12,35);
			long result1=obj1.addTwoNumer(12,35);
			System.out.println(" Updated Result: "+obj1.addTwoNumer(12,35));
			System.out.println("Program end");
			//static variable
			num1=45;
			num2=30;
			sum=num1+num2;
			System.out.println("Numner1 is: " +num1);
			System.out.println("Number2 is: " +num2);
			System.out.println("sum of 2 static variable is: "+sum);
			//non-static variable
			Assignment ref= new Assignment();
			ref.num4=23.5f;
			ref.num5=43.2f;
			ref.addition= ref.num5+ref.num4;
			System.out.println("Numner4 is: " +ref.num4);
			System.out.println("Number5 is: " +ref.num5);
			System.out.println("addition of 2 static variable is: "+ref.addition);
			
			
			//local variable
			//even number given range
			System.out.println("\n************10 to -5**************");
			for(int j=10;j>=-5;j--){
				System.out.print(j+ " ");
			}
			checkPrimeNumber();
			System.out.println("********************");
			Assignment.checkPrimeNumber(17);
			boolean result2= checkPrimeNumber(17);
			System.out.println(result2);
			
			Assignment obj2=new Assignment();
			obj2.evenNumberForGivenRange();
			//System.out.println();
			obj2.evenNumberForGivenRange(1);
			//boolean res=obj.evenNumberForGivenRange(1,20);
			//System.out.println("Even number given range: "+ obj.evenNumberForGivenRange(1,20));
				}
		
		 public static void  checkPrimeNumber()
		 {
			 int num=47,ct=0;
			// boolean res ;
				
				for(int j=1;j<=num;j++) {
					if(num%j==0) {
						ct++;
					}
					
				}    
				
				if(ct==2) {
					System.out.println("Given number is prime");
				}else {
					System.out.println("Given number is not a prime");
				}
			// return;
		 }
	 public static boolean  checkPrimeNumber(int num)
		 {
			  num=17; int ct=0;
			
				boolean res;
				for(int j=1;j<=num;j++) {
					if(num%j==0) {
						ct++;
					}
					
				}    
				
				if(ct==2) {
					System.out.println("Given number is prime");
					res= true;
				}else {
					System.out.println("Given number is not a prime");
					res= false;
				}
			return res;
		 }
		 public static void checkPrimeNumber(long num)
		 {
			  num=17; int ct=0;
			
				
				for(int j=1;j<=num;j++) {
					if(num%j==0) {
						ct++;
					}
					
				}    
				
				if(ct==2) {
					System.out.println("Given number is prime");
				}else {
					System.out.println("Given number is not a prime");
				}
		
		 } 
		 public void evenNumberForGivenRange() {
			 System.out.println("\n************10 to -5**************");
			
				for(int i=10;i>=-5;i--){
					System.out.print(i+ " ");
					//return ;
		 }
		}
		 
		 public void evenNumberForGivenRange(int k) {
			 System.out.println("\n**********1 to 20****************");
			 k=1;
				for(;k<=20;k++){
					System.out.print(k+ " ");
					//return ;
					
	}
		 }
	}


