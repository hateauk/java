package udpNetworkTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) {
		try {
			DatagramSocket dsoc = new DatagramSocket(7777);
			byte[] data = new byte[65536];

			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("���� ���� ����...");
			while (true) {
				dsoc.receive(dp);
				System.out.println("------���� �� �ּ� : "
						+ dp.getAddress().getHostAddress());
				System.out.println("�ڷ� ũ�� : " + dp.getLength());
				String utf8String = new String(new String(dp.getData()).trim().getBytes("UTF-8"));
				System.out.println("���� : " + utf8String);
			}
		} catch (Exception e) {
			System.out.println("���� : " + e);
		}
	}
}
