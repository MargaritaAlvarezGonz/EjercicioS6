package Java9;

import java.util.ArrayList;
import java.util.List;

interface Foo<T>{
	
}

public class OperadorDiamante {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("margarita");
				System.out.println(lista);
	}
	Foo<Integer> foo=new Foo() {
		
	}

}
