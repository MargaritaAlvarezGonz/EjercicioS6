package lambdas.comparator;

import java.util.Set;
import java.util.TreeSet;

public class PruebaComparator {
public static void main(String[] args) {
	//NombrePersonaComparator comparator = new NombrePersonaComparator();
	Comparator<Persona> comparator = (Persona p1, Persona p2)-> p1.getApellido().compareTo(p2.getApellido());
	Set<Persona> personas = new TreeSet<>(new comparator());
	
	personas.add(new Persona("Alex", "Bautista", 32));
	personas.add(new Persona("Juan", "Bautista", 48));
	personas.add(new Persona("Pedro", "Bautista", 22));
	personas.add(new Persona("Ajax", "Bautista", 56));
	}
	
	System.out.println(personas);

	}

}
}
//revisar clase 178. Los lamdas se parecen a la creación de los anonimos 
