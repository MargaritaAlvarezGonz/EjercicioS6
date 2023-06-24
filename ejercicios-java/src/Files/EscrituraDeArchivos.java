package Files;

public class EscrituraDeArchivos {
	public static void main(String[] args) {
		File f=new File("C:Cursos\Java");
		try(PrintWriter pw = new PintWriter(f)){
			pw.println("hola");
			pw.println("Siganme en");
			pw.println("@raivertrance");
			
		}
				
	}

}
