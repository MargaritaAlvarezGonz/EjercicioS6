package InnerClases;

public class ClasesANivelDeMetodo {
 static void foo() {}
 class ClaseInternaDeMetodo{
	 void bar() {
		 System.out.println("Bar");
	 }
	 ClaseInternaDeMetodo obj = new ClaseInternaDeMetodo();
		 obj.bar();
 }
}


//error en el codigo clase 138