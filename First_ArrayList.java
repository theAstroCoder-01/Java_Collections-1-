package Collection;

import java.util.ArrayList;
import java.util.Collections;


public class First_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// Add 10 random integers to the list.
		for(int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100));
		}
		
		System.out.println("Unsorted List: " + list);
		
		// Sort the list
		Collections.sort(list);
		System.out.println("Sorted List: " + list);
		
		
	}
}
