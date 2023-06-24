/**
 * 
 */
package Files;

import java.io.BufferedReader;

/**
 * @author Margarita
 *
 */
public class LecturaDeArchivo {
	public static void main(String[] args) {
		File f = new LecturaDeArchivo();
		if (f.exists()) {
			try (FileReader fr= new FileReader(f);{
				BufferedReader br =  new BufferedReader(fr);){
				do {
					String cadera = br.readLine();
					System.out.println(cadena);
				}while (cadena ! = null);
			}else {
				System.out.println("El archivo no existe");
			}
			}
		}
	}

}

//no cuento con el archivo para leer. Revisar clase161
