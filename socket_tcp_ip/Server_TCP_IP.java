import java.net.*;
import java.io.*;

public class Server_TCP_IP {

	 private ServerSocket serverSocket;
	 private Socket clientSocket;
	 private PrintWriter out;
	 private BufferedReader in;
	
	public void start(int port) {
		try {
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String greeting = in.readLine();
            if ("hello server".equals(greeting))
                out.println("hello client");
            else
                out.println("unrecognised greeting");
        } catch (IOException e) {
          
        }
		
	}
	
	public void stop() {
		try {
			in.close();
			out.close();
			clientSocket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server_TCP_IP server = new Server_TCP_IP();
		server.start(6666);
	}
}
