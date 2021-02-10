package sockets4;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerClient {

	public static void main(String[] args) {
		
		int portNumber = 2000;
		String hostName = "10.11.0.107";
		
		try(Socket socket = new Socket(hostName,portNumber);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())){
			
			Mensaje m = new Mensaje(Mensaje.Type.INFORMACION,"Esto es la info");
				
			oos.writeObject(m);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
