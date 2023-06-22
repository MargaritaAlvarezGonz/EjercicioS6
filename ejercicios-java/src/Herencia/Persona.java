package Herencia;

public class Persona {
 
	String nombre;
	String fechaDeNacimiento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	void dormir() {
		System.out.println("Soy " + nombre + " y estoy durmiendo");
	}
	void respirar() {
		System.out.println("Soy " + nombre + " y estoy respirando desde " + fechaDeNacimiento);
		
	}
	void comer() {
		System.out.println("Soy " + nombre + " y estoy comiendo");
	
}

}
