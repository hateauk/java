package udpNetworkTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("보낼 자료 입력 : ");
		String msg = in.readLine();

		DatagramSocket dsoc = new DatagramSocket();

		InetAddress ia = InetAddress.getByName("192.168.0.5");
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),
				msg.getBytes().length, ia, 7777);
		dsoc.send(dp);
		System.out.println("전송완료");
		dsoc.close();
	}
}