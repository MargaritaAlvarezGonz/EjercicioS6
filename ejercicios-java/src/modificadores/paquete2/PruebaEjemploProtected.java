package modificadores.paquete2;

import modificadores.paquete1.EjemploProtected;

public class PruebaEjemploProtected extends EjemploProtected {
	void bar() {
		foo();
	}
	public static void main(String[] args) {
		EjemploProtected e=new EjemploProtected();
		
	}

}
