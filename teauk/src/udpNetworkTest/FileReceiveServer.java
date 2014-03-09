package udpNetworkTest;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class FileReceiveServer {
	public static void main(String[] args) throws IOException {
		DatagramSocket soc = new DatagramSocket(8888);
		System.out.println("전송받을 준비 완료!");
		File file = null;
		DataOutputStream dos = null;

		while (true) {
			DatagramPacket dp = new DatagramPacket(new byte[512],512);
			soc.receive(dp);
			String str = new String(dp.getData()).trim();
			if (str.equalsIgnoreCase("start")) {// 대소문자를 구분하지 않고 start와 같은지...
				System.out.println("전송되고 있음!");
				file = new File("d:\\receivefile.txt");
				dos = new DataOutputStream(new BufferedOutputStream(
						
						new FileOutputStream(file)));
			}

			else if (str.equalsIgnoreCase("end")) {
				System.out.println("전송 완료!");
				soc.close();
				break;
			} else if (file != null) {
				dos.write(str.getBytes(), 0, str.getBytes().length);
			}
		}
		dos.close();
	}

}
