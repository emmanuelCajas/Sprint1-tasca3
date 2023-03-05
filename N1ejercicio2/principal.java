package tasca3.N1ejercicio2;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class principal {
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		
		List<Integer> numeros2 = new ArrayList<>();
	
		ListIterator<Integer> it = numeros.listIterator(numeros.size());

		while(it.hasPrevious()) {
			numeros2.add(it.previous());			
		}
		
		System.out.println(numeros2);
		}
	
}
