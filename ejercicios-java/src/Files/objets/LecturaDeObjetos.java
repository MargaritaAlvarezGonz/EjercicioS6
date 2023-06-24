package Files.objets;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaDeObjetos {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File ("C:Cursos\\Java\\programadores.txt");
		try(FileInputStream fis = new FileInputStream(file);
				ObjectInpñutStream ois = new ObjetInputSream(fis)){
			while (true) {
				try {
					
				}
			}
			
		}
	}

}//Falta codigo leccion 165
