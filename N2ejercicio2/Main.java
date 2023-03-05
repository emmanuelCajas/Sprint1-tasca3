package tasca3.N2ejercicio2;

import java.util.HashSet;

import tasca3.N2ejercicio1.Restaurant;

public class Main {
	
	public static void main(String[] args) {
		
		HashSet<Restaurant> listaRestaurant = new HashSet<Restaurant>();
		
		listaRestaurant.add(new Restaurant("plim plim",10));
		listaRestaurant.add(new Restaurant("Doraemon",7));
		listaRestaurant.add(new Restaurant("La granja",8));
		
		
		System.out.println(listaRestaurant);
		
		listaRestaurant.add(new Restaurant("La granja",5));
		
		System.out.println(listaRestaurant);
		
		
	}
	
}
