package colecciones;

import java.util.TreeSet;
class Perro{
	private String nombre;
	
	public Perro(String nombre) {
		super();
		this.nombre= nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + "]";
	}
	

	
}

public class EjemploComparables {
	public static void main(String[] args) {
		TreeSet<String> set =new TreeSet<>();
		set.add( new Perro ("Chabelita");
		set.add( new Perro ("Chabelita");
		set.add( new Perro ("rocky");
		
		System.out.println(new Perro("Chabelita"));

}

	//Nota: ESTE EJMPLO NO LO REALICÉ CORRECTAMENTE, REVISAR LA CLASE 117