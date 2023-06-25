package java8;

import java.util.Arrays;
import java.util.List;

class StringUtils{
	static boolean isUpperCase(String cad) {
		return cad.toUpperCase().equals(cad);
	}
}

public class MethodReference {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("alex", "margarita", "ajax");
		//names.stream().
		//filter(StringUtils::isUpperCase).
		
		for (String name : names) {
			System.out.println(name);
		}
		names.stream().forEach(System.out::println);
	}

}
