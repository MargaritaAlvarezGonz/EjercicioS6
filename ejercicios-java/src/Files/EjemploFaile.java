package Files;

import java.io.File;

public class EjemploFaile {
	public static void main(String[] args) {
		File f = new File("C:Cursos\Java");
		System.out.println("Is File " +f.isFile());
		System.out.println("Is directory" + f.isDirectory());
		System.out.println("Name "+ f. getName());
		File [] content = f.listFiles();
		for (File file: content) {
			System.out.println("Content - Is File "+ file.isFile());
			System.out.println("Content - Is directory "+ file.isDirectory());
			System.out.println("Content - Is File "+ file.getName());
			System.out.println("Content - Is File "+ file.isFile());

		}
	}
	

}
