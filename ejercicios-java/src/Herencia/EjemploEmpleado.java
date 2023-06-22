package Herencia;

public class EjemploEmpleado {
	public static void main(String[] args) {
		Empleado m = new Empleado(100,"Margarita","31-05-1981");
				
		m.dormir();
		m.trabajar();
		m.cobrar();
	}
}
