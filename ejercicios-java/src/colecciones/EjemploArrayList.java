package colecciones;

import java.util.ArrayList;

public class EjemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("raidentrance");
		array.add("margarita");
		array.add("raidentrance");
		array.add("margarita");
		array.add("raidentrance");
		array.add("margarita");
		array.add("raidentrance");
		array.add("margarita");
		array.add("raidentrance");
		array.add("margarita");
		array.add("raidentrance");
		array.add("margarita");
		
		//esto de acá abajo es ineficiente
		array.add(5, "Alex");
		System.out.println(array.size());
				
		System.out.println(array);		
	}

}
