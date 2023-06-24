package colecciones;

class Transporte{}
class Coche extends Transporte{}
class Deportivo extends Coche{}


class BeanGenerico<T extends Transporte>{
	private T valor;

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public BeanGenerico(T valor) {
		super();
		this.valor = valor;
	}
	
	
}
public class EjemplosGenericos {
	public static void main(String[] args) {
		BeanGenerico<Transporte> bean = new BeanGenerico<>(new Coche());
		
		
		//BeanGenerico <Transporte>bean= new BeanGenerico<>("Margarita");
		//System.out.println(bean.getValor());
		//bean.setValor("Pepe");
		//System.out.println(bean.getValor());
	}

}
