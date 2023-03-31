package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntercalarListas {
	public List<Integer> intercalarListas (List <Integer> a, List <Integer> b){
		List <Integer> aux = new ArrayList <Integer>();
		
		for ( Integer ca : a) {
			aux.add(ca);
		}
		for ( Integer cb : b) {
			aux.add(cb);
		}
		Collections.sort(aux);
		
		return aux;
		
	}
	public static void main(String[] args) {
		List <Integer> a = new ArrayList <Integer>();
		List <Integer> b = new ArrayList <Integer>();
		
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(6);
		a.add(8);
		a.add(9);
		a.add(10);
		b.add(2);
		b.add(4);
		b.add(7);
		
		System.out.println(a);
		System.out.println("-------");
		System.out.println(b);
		System.out.println("-------");
		
		IntercalarListas il = new IntercalarListas();
		System.out.println( il.intercalarListas (a, b));
		
	}
	}
