package optional;
import java.util.Optional;
public class PruebaOptional {
	private static Optional<String>[] nombres = {"Alex", "raidentrance", "devs"};
	
	public static String buscarPorNombre (String n) {
		for(String nombre: nombres) {
			if(nombre.equals(n)) {
				return Optional.of(nombre);
			}
		}
		return Optional.empty();
	}
public static void main(String[] args) {
	Optional<String> result = buscarPorNombre ("Pedro");
	if(result.isPresent(result.get().toUpperCase()) 
}else {
				String nombre = buscarPorNombre("Alex").orElse("Nombre Default");
				System.out.println();
			}
		
	}
	System.out.println(buscarPorNombre("Alex").toUpperCase());
}
}
//Clase 181