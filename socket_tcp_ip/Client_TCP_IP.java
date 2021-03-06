import java.io.*;
import java.net.*;

public class Client_TCP_IP {

	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	
	public void startConnection(String ip, int port) {
		
		try {
			clientSocket = new Socket(ip, port);
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
	
	public String sendMessage(String msg) {
		
		try {
			out.println(msg);
			return in.readLine();
		}catch(Exception e) {
			return null;
		}
		
	}
	
	public void stopConnection() {
		try {
			in.close();
			out.close();
			clientSocket.close();
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
