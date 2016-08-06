package sporadic.socket_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

// TODO: this program not working yet, make it work or start from scratch to write another socket
// program to better understand socket.

/**
 * Compile client and server and then start server as follows:
 * 
 * $ java GreetingServer 6066 Waiting for client on port 6066... Check client
 * program as follows:
 * 
 * $ java GreetingClient localhost 6066 Connecting to localhost on port 6066
 * Just connected to localhost/127.0.0.1:6066 Server says Thank you for
 * connecting to /127.0.0.1:6066 Goodbye!
 * 
 * But it's not working as above, running from Eclipse and from terminal,
 * neither worked. I'll have to figure out why it didn't work and make it work
 * in the future./
 * 
 * /** The following GreetingServer program is an example of a server
 * application that uses the Socket class to listen for clients on a port number
 * specified by a command-line argument:
 */
public class GreetingServer extends Thread {
	private ServerSocket serverSocket;

	public GreetingServer(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(10000);
	}

	public void run() {
		while (true) {
			try {
				System.out.println("Waiting for client on port "
						+ serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				System.out.println("Just connected to "
						+ server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(
						server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(
						server.getOutputStream());
				out.writeUTF("Thank you for connecting to "
						+ server.getLocalSocketAddress() + "\nGoodbye!");
				server.close();
			} catch (SocketTimeoutException s) {
				System.out.println("Socket timed out!");
				break;
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {
		int port = Integer.parseInt(args[0]);
		try {
			Thread t = new GreetingServer(port);
			t.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}