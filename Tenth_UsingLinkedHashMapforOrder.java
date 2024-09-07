package Collection;

import java.util.LinkedHashMap;


public class Tenth_UsingLinkedHashMapforOrder {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
			map.put("First", 1);
			map.put("Second", 2);
			map.put("Third", 3);
		
		System.out.println("LinkedHashMap (insertion order preserved): " + map);
		
	}
}
