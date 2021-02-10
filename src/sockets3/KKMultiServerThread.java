package sockets3;

import java.net.*;

import sockets2.KnockKnockProtocol;

import java.io.*;
 
public class KKMultiServerThread extends Thread {
    private Socket socket = null;
 
    public KKMultiServerThread(Socket socket) {
        super("KKMultiServerThread");
        this.socket = socket;
    }
     
    public void run() {
 
        try (
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    socket.getInputStream()));
        ) {
        	System.out.println("Conexion establecida de: " + socket.getRemoteSocketAddress().toString());
            String inputLine, outputLine;
            KnockKnockProtocol kkp = new KnockKnockProtocol();
            outputLine = kkp.processInput(null);
            out.println(outputLine);
            
 
            while ((inputLine = in.readLine()) != null) {
            	System.out.println(socket.getRemoteSocketAddress().toString() + " -> " + inputLine);
                outputLine = kkp.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye"))
                    break;
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}