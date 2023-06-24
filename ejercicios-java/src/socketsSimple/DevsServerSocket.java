package socketsSimple;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DevsServerSocket {
	public static void main(String[] args) {
	ServerSocket socket = new ServerSocket(5090);
	System.out.println("Escuchando peticiones");
	Socket client = socket.accept();
	System.out.println("Cliente%s conectado \n", client.getlInetAdress().getHostName());
	DataInputStream dis = new DataInputStream(client.getInputStream());
	String mensaje = null
	do {
		mensaje = dis.readUTF();
		} while(!"salir".equals(mensaje));
	
	client.close();
	dis.close();
	}
	}

}
//errores, revisar clase 168