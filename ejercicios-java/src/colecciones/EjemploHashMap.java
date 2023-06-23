package colecciones;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;;

public class EjemploHashMap {
	public static void main(String[] args) {
		Map<String,String> diccionario= new HashMap<>();
		diccionario.put("raidcentrance", "Es la cuenta del instructor");
		diccionario.put("Java", "Es el lenguaje que estamos aprendiendo");
		diccionario.put(null, "representa la ausencia de un objeto");
		diccionario.put("Java", "Es el lenguaje más chido y guay y que mola mucho");
		
		System.out.println(diccionario);
		for(String llave: diccionario.keySet()) {
			System.out.println(llave + "=" +diccionario.get(llave));
		}
		for(Entry<String,String> entry:diccionario.entrySet()) {
			System.out.println(entry.getKey()+ " = "+ entry.getValue());
			
		}
	}

}
