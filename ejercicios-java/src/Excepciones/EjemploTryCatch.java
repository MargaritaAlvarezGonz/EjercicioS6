package Excepciones;

public class EjemploTryCatch {
	public static void main(String[] args) {
		try {
			int x =0;
			int y =10/x;
			System.out.println("Después del error" +y);
			String nombre = null;
			System.out.println(nombre.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
			System.err.printf("NullPointerException %s", e.getMessage());
		}
		finally {
			System.out.println("Siempre se ejecuta");
		}
	}
	
}

//Codigo con errores revisar leccion 127,128
