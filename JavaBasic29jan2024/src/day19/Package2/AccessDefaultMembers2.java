package day19.Package2;

import day18.Package1.DefaultMembers;

public class AccessDefaultMembers2 {

	public static void main(String[] args) {
		
		DefaultMembers p1=new DefaultMembers();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
/**
we cann't access default members from outside the package
*/