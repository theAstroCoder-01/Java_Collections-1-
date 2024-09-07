package Collection;

import java.util.PriorityQueue;


class Person implements Comparable<Person> {
	
	String name;
	int age;

	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Fifth_PriorityQueuewithCustomObjects {

	public static void main(String[] args) {
		PriorityQueue<Person> queue = new PriorityQueue<>();
	       
			queue.add(new Person("Alice", 30));
	        queue.add(new Person("Bob", 25));
	        queue.add(new Person("Charlie", 35));
       
	    while (!queue.isEmpty()) {
            System.out.println(queue.poll());

		
		}
	}
}
