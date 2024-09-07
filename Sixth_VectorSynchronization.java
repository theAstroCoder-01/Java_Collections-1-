package Collection;

import java.util.Vector;


public class Sixth_VectorSynchronization {

	public static void main(String[] args) {
	
		Vector<Double> vector = new Vector<>();
		
			vector.add(1.1);
			vector.add(2.2);
			vector.add(3.3);
			
		System.out.println("Vector: " + vector);
			
			vector.add(1, 1.5);
			vector.remove(2.2);
		
		System.out.println("Vector after operations: " + vector);
		
		
	}
}
