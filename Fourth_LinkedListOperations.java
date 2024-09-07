package Collection;

import java.util.LinkedList;


public class Fourth_LinkedListOperations {

	public static void main(String[] args) {
	
		LinkedList<String> list = new LinkedList<>();
		
			list.add("A");
			list.add("B");
			list.add("C");
			list.add(1, "D");
			
			list.remove("B");
			
			System.out.println("LinledList: " + list);
		
	}
}
