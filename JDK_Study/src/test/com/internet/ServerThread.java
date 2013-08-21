package test.com.internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable{

	Socket s = null;
	BufferedReader br = null;
	
	public ServerThread(Socket s) {
		this.s = s;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String content = null;
		while ((content = readFromClient()) != null) {
			for (Socket s : MyServer.socketList) {
				try {
					PrintStream ps = new PrintStream(s.getOutputStream());
					ps.println(content);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	private String readFromClient() {
		try {
			return br.readLine();
		} catch (IOException e) {
			MyServer.socketList.remove(s);
		}
		return null;
	}

}
