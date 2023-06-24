package Files;

import java.io.BufferedReader;
import java.io.IOException;

public class LecturaDeTeclado {
	public static String readMessage (String prompt) {
		System.out.println(prompt);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
		
	}
	public static int readIngeter(String prompt) {
		return Integer.parseInt(readMessage(prompt));
	}
	
	public static void main(String[] args) throws IOException {
		String mensaje=readMessage("¿Cómo te llams"):
	int value =System.in.read();	
	System.out.println("Te llamas "+ mensaje);
	System.out.println("Tienes "+ edad);
	}

	//Repasar clase 160
}
