package InnerClases;

interface Jugable {
	abstract void jugar();
}
public class InterfacesAnonimas {
public static void main(String[] args) {
	Jugable j = new Jugable() {

		@Override
		public void jugar() {
			System.out.println();
			
		}
		
	};
}
}
