package Java9;
interface Bar{
	void foo();
	
	default  void foo(int x) {
		System.out.println(x);
		foo2(x);
	}
	private  void foo2(int x) {
		System.out.println(x);
	}
	private static void foo3(){
		
	}
}
public class EjemploPrivadosInterfaces {
	public static void main(String[] args) {
		
	}

}
//revisar la lección 221 hay un error en el codigo