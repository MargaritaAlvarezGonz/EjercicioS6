package colecciones;

import java.util.HashSet;

public class EjemploHashSet {
	public static void main(String[] args) {
		HashSet<String> nombres = new HashSet<>();
		System.out.println(nombres.add("mascota"));
		nombres.add("mascota");
		nombres.add("mascota");
		nombres.add("Ajax");
		nombres.add(null);
		System.out.println(nombres);
	}

}
