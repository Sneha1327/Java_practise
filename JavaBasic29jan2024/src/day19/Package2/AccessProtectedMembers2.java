package day19.Package2;

import day18.Package1.ProtectedMembers;

class AccessProtectedMembers2 extends ProtectedMembers {

	public static void main(String[] args) {
		
		AccessProtectedMembers2 p1=new AccessProtectedMembers2();
		System.out.println("Accessing Protected members from another class outside of package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
	}
}
/*
using inheritance we can access protected members from outside the package
*/