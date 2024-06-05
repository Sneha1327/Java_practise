package day8.Assignments;

public class WhileLoopCountNum {

	public static void main(String[] args) {
		 
		int count= 0, num =2345;
		while(num!=0) {
			num=num/10;
			
			
			count++;
		}
		System.out.println("Number of count: "+count);
		
	}

}
