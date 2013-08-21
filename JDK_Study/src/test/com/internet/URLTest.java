package test.com.internet;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://www.baidu.com");
			System.out.println(url.getProtocol());
			URLConnection con = url.openConnection();
			System.out.println(con.getContentLength());
			con.connect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
