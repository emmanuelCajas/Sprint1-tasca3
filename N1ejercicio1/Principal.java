package tasca3.N1ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


/*
 * Crea una clase llamada Month con un atributo "name" (que almacenará el nombre del mes del año). 
 * Añade 11 objetos Month (cada uno con su atributo diferente) en un ArrayList, a excepción del objeto 
 * con atributo "Agosto". Después, efectúa la inserción en el lugar que corresponde a este mes y 
 * demuestra que el ArrayList mantiene el orden correcto.

 *Convierte el ArrayList del ejercicio anterior en un HashSet y asegúrate de que no permite duplicados.

 *Recorre la lista con un foro y con un iterador.
 */


public class Principal {

	public static void main(String[] args) {
				
		ArrayList<Month> arrayListMonth= new ArrayList<>();
			
		arrayListMonth.add(new Month("Enero"));
		arrayListMonth.add(new Month("Febrero"));
		arrayListMonth.add(new Month("Marzo"));
		arrayListMonth.add(new Month("Abril"));
		arrayListMonth.add(new Month("Mayo"));
		arrayListMonth.add(new Month("junio"));
		arrayListMonth.add(new Month("Julio"));
		arrayListMonth.add(new Month("Setiembre"));
		arrayListMonth.add(new Month("octubre"));
		arrayListMonth.add(new Month("Noviembre"));
		arrayListMonth.add(new Month("Diciembre"));
	
		
		//agregando agosto en posicion indicada
		arrayListMonth.add(7, new Month("Agosto"));
		
		for (Month month : arrayListMonth) {
			System.out.println(month);
		}
		
		//Copiando ArrayList a HashSet
		HashSet<Month> hashSetMonth = new HashSet<>(arrayListMonth);	
		hashSetMonth.add(new Month("Marzo"));
		
		for (Month month : hashSetMonth) {
			System.out.println("HashSet" + month);
		}
		
		//Recorriendo HashSet con iterator y un For
		Iterator<Month> it = arrayListMonth.iterator();
		
		for(int i=1;i<=hashSetMonth.size();i++) {
			System.out.println("for " + it.next());
		}

		
	}

}
