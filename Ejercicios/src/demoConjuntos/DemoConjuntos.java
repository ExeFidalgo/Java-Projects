package demoConjuntos;

import java.util.Set;
import java.util.TreeSet;

public class DemoConjuntos {

	public static void main(String[] args) {
		Set<Integer> conjunto = new TreeSet <Integer>();
			
			conjunto.add(25);
			conjunto.add(2);
			conjunto.add(5);
			conjunto.add(485);
			conjunto.add(2587);
			
			System.out.println(conjunto);
	}
}
