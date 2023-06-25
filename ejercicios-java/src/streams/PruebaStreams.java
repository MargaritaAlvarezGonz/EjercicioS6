package streams;

import java.lang.reflect.Array;
import java.util.List;

class Persona{
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad= edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
public class PruebaStreams {
	public static void main(String[] args) {
		List<Persona> personas Array.asList("Juan", 10) new Persona ("Pepe", 30),
		new Persona("Maria", 18));
	}
	List<Persona> result = new ArrayList<>();
	int count = 0;
	for (Persona persona: personas) {
		if(persona.getEdad()>18) {
			result.add(persona);
			count ++;
		}
		if(conunt ==3) {
			break;
		}
	}

}
// revisar clase 183-184 Revisar formas funcionales e imperativas