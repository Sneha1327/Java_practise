package day29.CollectionArray;
import java.util.ArrayList;
public class CollectionPractice {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("abd");
		list.add("bd");
		list.add("ad");
		list.add("ab");
		list.add(123);
		list.forEach(li -> {
			System.out.println(li);
			});
		}
		
	}


