package test.com.internet;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(30000);
			while (true) {
				Socket s = ss.accept();
				PrintStream ps = new PrintStream(s.getOutputStream());
				ps.println("hello, you get a box from server");
				ps.close();
				s.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
