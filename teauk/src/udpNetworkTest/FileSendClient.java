package udpNetworkTest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class FileSendClient {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DataInputStream dis = null;

		System.out.print("���۴�� = ");
		String ip=null;
		String filename=null;
		try{
		ip = in.readLine();
		System.out.print("�������� = ");
		filename = in.readLine();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		File file = new File(filename);
		if (!file.exists()) {
			System.err.println("������ �������� �ʽ��ϴ�.");
			System.exit(-1);
		}
		DatagramSocket ds = new DatagramSocket();
		InetAddress ia = InetAddress.getByName(ip);
		
		String str = "start";
		DatagramPacket dp = new DatagramPacket(str.getBytes(),
				str.getBytes().length, ia, 8888);
		ds.send(dp);

		dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
				file)));
		byte[] by = new byte[512];
		while (true) {
			int xx = dis.read(by, 0, by.length);
			if (xx == -1)
				break;
			dp = new DatagramPacket(by, xx, ia, 8888);
			ds.send(dp);
		}
		str = "end";
		dp = new DatagramPacket(str.getBytes(), str.getBytes().length, ia, 8888);
		ds.send(dp);

		dis.close();
		ds.close();

		System.out.println("���� �Ϸ�");//192.168.0.5
	}

}

