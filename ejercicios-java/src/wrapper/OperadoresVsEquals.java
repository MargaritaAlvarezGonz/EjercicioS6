package wrapper;

import java.util.Objects;

class Perro{
	private String nombre;
	public Perro(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perro other = (Perro) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
}
public class OperadoresVsEquals {
	public static void main(String[] args) {
		Perro p = new Perro ("Chabelita");
		Perro p1 = new Perro ("Rocky");
		System.out.println(p==p1);
	}
@Override
public boolean equals(Object obj) {
	if(obj instanceof Perro) {
		Object Perro;
		(Perro)obj;
	}else}
retur false;
	}
		
	}
}

}
