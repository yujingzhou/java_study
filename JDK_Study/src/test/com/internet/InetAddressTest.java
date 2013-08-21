package test.com.internet;

import java.net.InetAddress;

public class InetAddressTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			InetAddress ip = InetAddress.getByName("www.baidu.com");
			System.out.println("百度是否可达" + ip.isReachable(2000));
			System.out.println(ip.getHostAddress());
			
			InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});
			System.out.println("本机是否可达" + local.isReachable(5000));
			System.out.println(local.getCanonicalHostName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
