package day24.Predefineclasses.Objectclass;

class Print extends Object{	
	int a=10;
	@Override
	public int hashCode() {
		return 101;
	}
	@Override
	public String toString() {
		return "I am Print Class toString";
	}
	@Override
	public boolean equals(Object obj) {//Object obj = p2 = new Print();--> Object obj = new Print();//Auto up casting
		Print p=(Print)obj;//down casting
		return (this.a==p.a);
	}	
}
public class Example6{

	static int last_roll = 100;   // equals(p2)= equals(Object obj)
	int roll_no;
	Example6()
    {
        roll_no = last_roll;
        last_roll++;
    }	
	public static void main(String args[]) {
		
		Example6 s1 = new Example6();
		System.out.println("s: toString of ObjectClass4: "+s1);//fc
		System.out.println("s: hashCode of ObjectClass4: "+s1.hashCode());//decimal
		
		Example6 s2 = new Example6();
		System.out.println("s2: toString of ObjectClass4: "+s2);//fc
		System.out.println("s2: hashCode of ObjectClass4: "+s2.hashCode());//decimal
		System.out.println("s1 & s2 compare: "+s1.equals(s2));//false
		Example6 s3 =s2;
		System.out.println("s3 & s2 compare: "+s3.equals(s2));//true
		Print p1=new Print();
		System.out.println("toString of Print: "+p1);//line 11
		System.out.println("hashCode of Print: "+p1.hashCode());//101
		
		Print p2=new Print();
		System.out.println("toString of Print: "+p2);//line 11
		System.out.println("hashCode of Print: "+p2.hashCode());// 101
		System.out.println("Comparing Print class object p1 & p2 with overriden equals() :"
								+p1.equals(p2));//false
	}
}
/*
 *  == --->compare two values
 *  d1.equals(d2) --> compare two objects based on there address
 * 
 */
