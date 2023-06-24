package Files.objets;

import java.io.File;

public class EscrituraDeObjetos {
	public static void main(String[] args) {
		Programador programadores[] = {new Programador("Margarita", "Java"), 
				new Programador("Alex", "Java")};
		File file = new File ("C:Cursos\\Java\\programadores.txt");
		if (!file.exists())
		FileOutputStream fos= new FileOutputStream()
	}

}
//Codigo incompleto, revisar leccion 164