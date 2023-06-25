package java8;
interface Bar{
	void foo();
	default  void foo(int x) {
		System.out.println(x);
		foo2(x);
		foo3();
	}
	default  void foo2(int x) {
		System.out.println(x);
	}
	static void foo3(){
		
	}
}
	// por default, el metodo defaul es publico en las versiones antes de java
public class EjemploPrivadosInterfaces {
	public static void main(String[] args) {
		
	}
}
