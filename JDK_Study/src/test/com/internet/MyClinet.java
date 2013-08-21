package test.com.internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClinet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 30000);
			new Thread(new ClientThread(s)).start();
			PrintStream ps = new PrintStream(s.getOutputStream());
			String line = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while((line = br.readLine()) != null) {
				ps.println(line);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
