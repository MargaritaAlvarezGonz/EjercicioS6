package statics;
class SerVivo{
	public SerVivo() {
		System.out.println("Constructor ser vivo");
	}
}

class Humano extends SerVivo{
	static int numeroDeHumanos=0;
	String nombre;
	
	public Humano() {
		super();
		System.out.println("Constructor");
	}

	public Humano(String nombre) {
	System.out.println("Constructor sobrecargado");
		this.nombre = nombre;
	}
	
	{
		System.out.println("Bloque anónimo");
		numeroDeHumanos++;
	}
	{
		System.out.println("2");
		
	}
	
}



public class EjemploSaticEnVariables {
	int x = 0;
	public static void main(String[] args) {
		//EjemploSaticEnVariables e = new EjemploSaticEnVariables();
		//System.out.println(e.x);
		
		System.out.println(Humano.numeroDeHumanos);
		new Humano();
		new Humano();
		new Humano("Alex");
		new Humano();
		System.out.println(Humano.numeroDeHumanos);
}
}
