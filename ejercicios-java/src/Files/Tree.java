package Files;

import java.io.File;

public class Tree {
	private static void print (File[]files, String tabs ) {
		String spaces=tabs.concat("-");
		if(files!=null) {
			for(File file: files) {
				if(file.isFile()) {
					System.out.printf("%s /s \n", spaces, file.getName());
				}else {
					System.out.printf("%s /s \n", spaces, file.getName());
				}
			}
		}
	}
 public static void main(String[] args) {
	 File f = new file ("Aquí va la ruta donde está el archivo");
	 System.out.println();
	 print(f.listFiles(), "-");
	
}
}
