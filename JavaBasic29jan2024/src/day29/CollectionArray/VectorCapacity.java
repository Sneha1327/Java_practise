package day29.CollectionArray;

import java.util.Vector;

public class VectorCapacity {
	public static void main(String[] args) {
		Vector<String> vcTr = new Vector<String>();
		System.out.println("Default,Vector Capacity: " + vcTr.capacity());//1.0 version//10
		System.out.println("Vector Size: " + vcTr.size());//0
		vcTr.setSize(8);
		System.out.println("Vector Size: " + vcTr.size());//
		System.out.println("Vector elements: "+vcTr);
		vcTr.addElement("Sunday");
		vcTr.addElement("Monday");
		System.out.println("after addition, Vector elements: "+vcTr);
		System.out.println("after add, Vector Size: " + vcTr.size());//
		vcTr.addElement("Wednesday");
		System.out.println("After addElement, Vector Size: " + vcTr.size());//
		System.out.println("Vector Capacity: " + vcTr.capacity());//
	}
}


