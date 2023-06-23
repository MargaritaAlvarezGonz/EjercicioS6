package arreglos;

public class InicializacionDeArreglos {
	static void imprimirArreglo(String arreglo[]) {
		for(String valor: arreglo) {
			System.out.println(valor);
		}
	}
	public static void main(String[] args) {
		//inicialización explícita
		String nombres[]=new String[3];
		nombres[0]="radientrance";
		nombres[1]="devs4j";
//		imprimirArreglo(nombres);
		
		//inicialización implícita
		String nombres2[]= {"raidentrance", "devs4j"};
//		imprimirArreglo(nombres2);
		//y la forma anónima
		String nombres3[]=new String[] {"raidentrance", "devs4j"};
		imprimirArreglo(nombres3);
	}

}
