package test.com.internet;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServer {
	
	public static ArrayList<Socket> socketList = new ArrayList<Socket>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(30000);
			while (true) {
				Socket s = ss.accept();
				socketList.add(s);
				new Thread(new ServerThread(s)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
