package Collection;

import java.util.HashMap;
import java.util.Map;


public class Eigth_HashMapIteration {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
			map.put("A", 1);
			map.put("B", 2);
			map.put("C", 3);
		
		// Iterate using keySet
		System.out.println("Using keySet: ");
		
		for(String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		// Iterate using entrySet
		System.out.println("Using entrySet: ");
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		
			
		}
	}
}
