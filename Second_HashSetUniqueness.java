package Collection;

import java.util.HashSet;

	
public class Second_HashSetUniqueness {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
			set.add("Apple");
			set.add("Banana");
			set.add("Apple");
			set.add("Orange");
		
		System.out.println("HashSet: " + set);
		
		
	}
}
