package Collection;

import java.util.ArrayList;
import java.util.Collections;


public class Ninth_CollectionsUtilityMethods {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<>();
		
			list.add("One");
			list.add("Two");
			list.add("Three");
			list.add("Four");
			
		System.out.println("Original List: " + list);
		
			// Reversing the list
			Collections.reverse(list);
		
		System.out.println("Reversed List: " + list);
		
			// Shuffling the list
			Collections.shuffle(list);
		
		System.out.println("Shuffled List: " + list);
		
	}
}
