package Excepciones;
class Recursos implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Liberando recursos");
		
	}
	
	
}
public class EjemploTryWithResources {
	public static void main(String[] args) {
		//try {
			// codigo para accceder
		//}catch (Exception e){
			//Codigo en caso de error
		//}finally {
			//Cerrar la conexión a la base de datos
		//}
	//}
	
	// 
	//	try (RecursoDev4j)recurso = new RecursoDev4j()
	

}

	//Repasar la clase 130
	