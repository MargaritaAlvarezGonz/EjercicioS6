package streams;

import java.util.Arrays;
import java.util.List;

public class MaximosYMinimos {
	public static void main(String[] args) {
		List<Integer> numbers =Arrays.asList(5,6,78,95,7,58);
		int min=numbers.get(0);
		for (Integer number: numbers) {
			if(number<min) {
				min=number;
			}
		}
		System.out.println("El valor del numero menor  es " + min);
		
		//Revisar leccion 186 para implementar el comparator
		
	}

}
