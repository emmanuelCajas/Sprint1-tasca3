package tasca3.N2ejercicio1;

import java.util.Objects;

public class Restaurant {
	private String nombre;
	private int puntuacion;
	
	public Restaurant(String nombre, int puntuacion) {
		
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(puntuacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return puntuacion == other.puntuacion;
	}

	@Override
	public String toString() {
		return " Restaurant [nombre=" + nombre + " puntuacion=" + puntuacion + "]" + "\n";
	}
	
	
	
}
