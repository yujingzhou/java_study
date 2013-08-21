package test.com.internet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("127.0.0.1", 30000);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = br.readLine();
			System.out.println("come form server" + line);
			br.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
