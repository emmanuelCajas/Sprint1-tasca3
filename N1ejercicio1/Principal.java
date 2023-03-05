package tasca3.N1ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
	
		arrayListMonth.add(7, new Month("Agosto"));
		
		for (Month month : arrayListMonth) {
			System.out.println(month);
		}
				
		HashSet<Month> hashSetMonth = new HashSet<>(arrayListMonth);	
		hashSetMonth.add(new Month("Marzo"));
		
		for (Month month : hashSetMonth) {
			System.out.println("HashSet" + month);
		}
		
		Iterator<Month> it = arrayListMonth.iterator();
		
		for(int i=1;i<=hashSetMonth.size();i++) {
			System.out.println("for " + it.next());
		}

		
	}

}
