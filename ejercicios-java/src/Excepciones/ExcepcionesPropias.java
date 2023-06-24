package Excepciones;

class TituloIncorrectoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3887046562988530180L;
	public TituloIncorrectoException(String error) {
		super(error);
	}
}
public class ExcepcionesPropias {
	static void crearCurso(String titulo) {
		if(!titulo.toUpperCase().equals(titulo)) {
			throw new TituloIncorrectoException("El título debe estar en mayúsculas");
		}
		System.out.println("Titulo correcto");
		
	}
	public static void main(String[] args) {
		crearCurso("JAVA DESDE CERO A PROFUNDIDAD");
		
	}

}
