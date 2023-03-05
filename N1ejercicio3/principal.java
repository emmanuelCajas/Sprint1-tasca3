package tasca3.N1ejercicio3;

import java.io.File;
import java.io.IOException;

public class principal {

	public static void main(String[] args) {
		File fichero = new File("c:/Users/formacio/Desktop/prueba.txt");
		
		 if (!fichero.exists()) {
             try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
         }
	}
}
