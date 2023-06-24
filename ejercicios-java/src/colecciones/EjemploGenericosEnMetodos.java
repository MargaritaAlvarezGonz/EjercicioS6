package colecciones;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericosEnMetodos {
	static double sumarValores(List<Double>valores) {
		double suma =0.0;
		for (Double valor : valores) {
			suma+=valor.doubleValue();
		
		}
		return suma;
	}
public static void main(String[] args) {
	double sumarValores = sumarValores(Arrays.asList(10.45,11.45));
	System.out.println("Suma" + sumarValores);
}
}

//Actualizar ejemplo clase 122