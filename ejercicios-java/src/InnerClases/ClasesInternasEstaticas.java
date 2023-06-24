package InnerClases;

class ExternalStatic{
	public void foo() {
		System.out.println("Foo");
	}
	static class IntenalStatic{
		void bar() {
			System.out.println("Bar");
		}
	}
}
public class ClasesInternasEstaticas {
public static void main(String[] args) {
	ExternalStatic.IntenalStatic obj = new ExternalStatic.IntenalStatic();
	obj.bar();
}
}
