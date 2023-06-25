package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverDatosDuplicados {
public static void main(String[] args) {
	List<Integer> numbers =Arrays.asList(5,5,5,78,95,7,58);
	System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
	System.out.println(numbers.stream().collect(Collectors.toSet()));
}
}
