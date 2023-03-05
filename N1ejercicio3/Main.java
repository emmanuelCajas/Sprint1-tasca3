package tasca3.N1ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		String separador = ",";
		BufferedReader br = null;
		HashMap<String, String> paises= new HashMap<String, String>();
		
	
		//Accede al archivo y agrega el contenido al HashMap
		try {
			br = new BufferedReader(new FileReader("c:/Users/formacio/Desktop/paises.txt"));
			String linea;
			
				linea = br.readLine();
				String[] cadena;
				while(linea != null) {
					cadena = linea.split(separador);
					paises.put(cadena[0],cadena[1]);
					linea =br.readLine();
				}
				
				System.out.println(paises);
					
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
			
		
		//Obtiene las key del HashMap y los guarda en una lista
		
		Object[] listaDePaises = paises.keySet().toArray();
		
		//Se pide datos para gusrdarlos en las variables
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su numero de Usuario:");
		String numeroUsuario=sc.next();
		
		Object paisAleatorio = "";
		int puntosAcumulados = 0;
		//Se genera un pais aleatorio se pregunta la capital se iguala con los datos HashMap
		for(int i=0; i<10; i++){
			 paisAleatorio = listaDePaises[new Random().nextInt(listaDePaises.length)];
			 System.out.println("Cual es la capital de: " + paisAleatorio);
			 String capital =sc.next();
			 if(capital.equals(paises.get(paisAleatorio).toString())) {
				puntosAcumulados++; 
				System.out.println("Es correcto acumula 1 punto");
			 }
	  
		}
		
		System.out.println("El usuario " + numeroUsuario +" tiene "+puntosAcumulados+" puntos" );
			 
		
		//Se crea un archivo para guardar el usuario y puntaje correspondiente
		
			try {
				File archivo = new File("c:/Users/formacio/Desktop/prueba.txt");
				if(!archivo.exists()) {
					archivo.createNewFile();
					System.out.println("El archivo ha sido creado");
				}

				FileWriter fr = new FileWriter(archivo);
				BufferedWriter bw= new BufferedWriter(fr);
				bw.write("El usuario " + numeroUsuario +" tiene "+puntosAcumulados+" puntos");
				bw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
