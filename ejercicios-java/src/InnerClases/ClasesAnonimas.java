package InnerClases;

class EjemploAnonima{
	void foo() {
		System.out.println();
	}
	
}
public class ClasesAnonimas {
	public static void main(String[] args) {
		EjemploAnonima obj = new EjemploAnonima() {
//una clase anonima termina siendo un objeto			
		@Override
			void foo() {
			System.out.println("Bar");
		}
		};
			obj.foo();
		
		};
	}


