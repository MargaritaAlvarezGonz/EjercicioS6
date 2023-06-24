package socketsSimple;

import java.net.NoRouteToHostException;

public class DevClientSocket {
	public static void main(String[] args)throws NoRouteToHostException, IOException {
		Socket socket = new Socket("localhost", 8090);
		DataOutputStream dos = new DataOutputStream(socket)
	}

}
//revisar clase 169,170