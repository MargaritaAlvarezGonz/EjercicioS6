package colecciones;

import java.util.TreeMap;

public class EjemploTreeMap {
	public static void main(String[] args) {
		TreeMap<String,String>map = new TreeMap<>();
		map.put("Chicharito", "Futbolista");
		map.put("Alex", "Programador leon");
		map.put("Vicky", "Persona felilz");
		
		System.out.println(map);
		
	}

}
