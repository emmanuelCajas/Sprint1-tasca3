package tasca3.N3ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prueba {

	public static void agregarPersona() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el Nombre: ");
		String nombrenuevo = sc.nextLine();
		System.out.println("Ingrese el Apellido: ");
		String apellidoNuevo = sc.nextLine();
		System.out.println("Ingrese la edad: ");
		String edadNuevo = sc.nextLine();

		String archivoCSV = "c:/Users/rodri/Desktop/datos.csv";
		String separador = ",";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCSV, true))) {

			bw.write(nombrenuevo + separador + apellidoNuevo + separador + edadNuevo);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String archivoCSV = "c:/Users/rodri/Desktop/datos.csv";
		String separador = ",";

		List<Persona> listaPersonas = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {

			// Ignora la primera línea (cabecera)
			String linea = br.readLine();

			// Lee los datos del archivo línea por línea
			while ((linea = br.readLine()) != null) {

				String[] campos = linea.split(separador);

				String nombre = campos[0];
				String apellido = campos[1];
				String dni = campos[2];

				Persona persona = new Persona(nombre, apellido, dni);
				listaPersonas.add(persona);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Ordena la lista de personas por nombre de forma ascendente
		Collections.sort(listaPersonas);

		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}

		

	}

}
