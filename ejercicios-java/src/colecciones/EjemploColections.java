package colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploColections {
	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Chabelita");
		nombres.add("Rocky");
		nombres.add("Ajax");
		Collections.sort(nombres);
		int index = Collections.binarySearch(nombres, "Ajax");
		System.out.println(nombres);
		System.out.println(nombres.get(index));
		
	}

}
