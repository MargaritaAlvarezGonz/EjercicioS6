package arreglos;
enum SaborPalomitas{
	CHILE("Chile", 20.0f), MANTEQUILLA("Mantequilla",30.0f), QUESO("Quesito",35.0f);
	private String nombreDeVenta;
	private float precio;
	
	private SaborPalomitas (String nombreDeVenta, float precio) {
		this.nombreDeVenta=nombreDeVenta;
		this.precio=precio;
	}
	
	

	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public String getNombreDeVenta() {
		return nombreDeVenta;
	}

	public void setNombreDeVenta(String nombreDeVenta) {
		this.nombreDeVenta = nombreDeVenta;
	}
	
}
public class EjemploEnumeraciones {
	public static void main(String[] args) {
		SaborPalomitas 	queso =SaborPalomitas.QUESO;
		System.out.println(queso.name());
		System.out.println(queso.getNombreDeVenta());
	}

}
