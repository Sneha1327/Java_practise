package day27.WrapperClass;

public class UnBoxingOperation2 {

	public static void main(String[] args) {
	
		Double doubleObj=25.2566;//boxing
		System.out.println("doubleObj: "+doubleObj);//25.2566
		//un-boxing
		double salary=doubleObj.doubleValue();// 
		System.out.println(salary);
		System.out.println(doubleObj==salary);//t
		
		Boolean b=true;//
		boolean b1=b.booleanValue();//
		
		Character c1=(Character)'a';//
		char c2=c1.charValue();//
		
		Integer i=25;
		int d=i.intValue();
	}
}
