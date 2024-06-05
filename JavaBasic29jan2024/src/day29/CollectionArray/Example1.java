package day29.CollectionArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		//generic collection, is used when we want a collection to store same type of Objects
		List<String> ref2 = new ArrayList<String>();
		ref2.add("Demo");
		ref2.add("Example");
		ref2.add("Collection");
		System.out.println(ref2);
		List<Integer> ref3 = new ArrayList<Integer>();
		ref3.add(25);
		ref3.add(35);
		ref3.add(45);
		System.out.println(ref3);
		
	
		List<Character> ref4 = new ArrayList<Character>();
		ref4.add('a');
		ref4.add('g');
		ref4.add('f');
		
		System.out.println(ref4);
	}
	public static void rearrangingelements() {
		List ref1 = new ArrayList();// inheritance+upcasting+overriding ==>RTP
		ref1.add("CoreJava");// String will be converted to Object class object using upcasting
		ref1.add(10);// Auto-boxing - Integer class object --> upcasted to Object class object
		ref1.add("API");
		ref1.add(null);
		System.out.println("Ref1 elements are: "+ref1);
		List ref2 = new ArrayList();// inheritance+upcasting+overriding ==>RTP
		ref2.add("CoreJava");// String will be converted to Object class object using upcasting
		ref2.add("Manual Testing");// Auto-boxing - Integer class object --> upcasted to Object class object
		ref2.add(10);
		ref2.add("Selenium");
		System.out.println("Ref2 elements are: "+ref2);		
		ref1.retainAll(ref2);
		System.out.println("After retaining Ref2 elements in Ref1, elements are: "+ref1);
		
		List l1=new ArrayList();
		l1.add("Mango");
		l1.add("Banana");
		l1.add("Orange");
		l1.add("Apple");
		l1.add("Grapes");
		System.out.println("l1 list elements: "+l1);
		
		//sort list elements in ascending order and stores the sorted element in the same collection
		Collections.sort(l1);
		System.out.println("l1 elements after sorting: "+l1);
		//it will reverse the element of collection
		Collections.reverse(l1);
		System.out.println("after reverse, l1 elements after sorting: "+l1);
	}
	
	public static void updateAndRemove() {
		List ref1 = new ArrayList();// inheritance+upcasting+overriding ==>RTP
		ref1.add("CoreJava");// String will be converted to Object class object using upcasting
		ref1.add(10);// Auto-boxing - Integer class object --> upcasted to Object class object
		ref1.add("CoreJava");
		ref1.add(null);
		System.out.println("Ref1 elements are: "+ref1);
		//update existing element of collection
		ref1.set(2, "Selenium");
		System.out.println("Updated, Ref1 elements are: "+ref1);
		
		System.out.println("Element removed from index1 is: "+ref1.remove(1));
		System.out.println("After removing index1 element: "+ref1);
		
		System.out.println("Element removed using object : "+ref1.remove(null));
		System.out.println("After removing null element: "+ref1);
		//delete all element of list
		ref1.clear();
	}
	
	public static void iterationOfCollectionElements() {
		List ref1 = new ArrayList();// inheritance+upcasting+overriding ==>RTP
		ref1.add("CoreJava");// String will be converted to Object class object using upcasting
		ref1.add(10);// Auto-boxing - Integer class object --> upcasted to Object class object
		ref1.add("CoreJava");
		ref1.add(null);
		System.out.println("************Get one by one list elements using for loop****************");
		for (int i = 0; i < ref1.size(); i++) {
			System.out.println("Element at index " + i + ": " + ref1.get(i));
		}
		System.out.println("************Get one by one list elements using foreach loop****************");
		for(Object obj:ref1) {
			System.out.println("Element: "+obj);
		}
		System.out.println("************Get one by one list elements using Iterator****************");
		/*
		 * Iterator: is an interface to iterate collection elements one by one without indexing as well
		 * it has following useful method-
		 * 	hasNext(): return boolean value, true: it has next element | false: it won;t have next element
		 * 	next(): returns next element of collection, if no element found it will throw an exception by name "NoSuchElementException"
		 * 	remove(): remove elements from collection
		 * 
		 * NOTE: Iterator object can be used only once, for each iteration you have to create new iterator instance
		 */
		Iterator itr=ref1.iterator();
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());//NoSuchElementException
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Once iteration is over,if you try to use same iterator object, don you won;t get collection element: "+itr.hasNext());
		System.out.println("*****************Using 2nd Iterator instance********************");
		Iterator itr2=ref1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	
	public static void addingCollections() {
		List ref1 = new ArrayList();// inheritance+upcasting+overriding ==>RTP
		ref1.add("CoreJava");// String will be converted to Object class object using upcasting
		ref1.add(10);// Auto-boxing - Integer class object --> upcasted to Object class object
		ref1.add("CoreJava");
		ref1.add(null);
		System.out.println("List1 elements: " + ref1);
		List ref2 = new ArrayList();
		ref2.add("Mango");
		ref2.add("Banana");
		ref2.add("Apple");
		System.out.println("List2 elements: " + ref2);
		// adding List2 elements in List1
		ref1.addAll(ref2);
		System.out.println("Updated list1 elements: " + ref1);
		// remove List2 from list1
		ref1.removeAll(ref2);
		System.out.println("After removing list2, Updated list1 elements: " + ref1);

		// adding list2 in list1 at index 2
		ref1.addAll(2, ref2);
		System.out.println("After addinf List2 in list1 at index2: " + ref1);
		// remove List2 from list1
		ref1.removeAll(ref2);
		System.out.println("After removing list2, Updated list1 elements: " + ref1);
	}

	public static void elementAdditionInList() {
		// ArrayList ref=new ArrayList();
		// or
		List ref = new ArrayList();// inheritance+upcasting+overriding ==>RTP
		// to add element in List
		ref.add("CoreJava");// String will be converted to Object class object using upcasting
		ref.add(10);// Auto-boxing - Integer class object --> upcasted to Object class object
		ref.add("CoreJava");
		ref.add(null);
		System.out.println("Element stored in List: " + ref);
		ref.add(2, "Selenium");
		System.out.println("Updated Element List: " + ref);
		System.out.println("Element at index 1: " + ref.get(1));
		System.out.println("Count of elements stored in List: " + ref.size());
		System.out.println("************Get one by one list elements****************");
		for (int i = 0; i < ref.size(); i++) {
			System.out.println("Element at index " + i + ": " + ref.get(i));
		}
	}
}
/*
 * toString() overrided --->when collection object printed you will get value
 * stored in collection
 * 
 */