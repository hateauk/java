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

		System.out.print("전송대상 = ");
		String ip=null;
		String filename=null;
		try{
		ip = in.readLine();
		System.out.print("전송파일 = ");
		filename = in.readLine();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		File file = new File(filename);
		if (!file.exists()) {
			System.err.println("파일이 존재하지 않습니다.");
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

		System.out.println("전송 완료");//192.168.0.5
	}

}

