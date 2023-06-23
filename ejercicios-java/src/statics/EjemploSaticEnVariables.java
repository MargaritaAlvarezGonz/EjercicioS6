package statics;

class Humano{
	static int numeroDeHumanos=0;
	public Humano() {
		numeroDeHumanos++;
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
		new Humano();
		new Humano();
		System.out.println(Humano.numeroDeHumanos);
}
}
