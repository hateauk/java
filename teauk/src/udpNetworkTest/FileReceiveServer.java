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
		System.out.println("���۹��� �غ� �Ϸ�!");
		File file = null;
		DataOutputStream dos = null;

		while (true) {
			DatagramPacket dp = new DatagramPacket(new byte[512],512);
			soc.receive(dp);
			String str = new String(dp.getData()).trim();
			if (str.equalsIgnoreCase("start")) {// ��ҹ��ڸ� �������� �ʰ� start�� ������...
				System.out.println("���۵ǰ� ����!");
				file = new File("d:\\receivefile.txt");
				dos = new DataOutputStream(new BufferedOutputStream(
						
						new FileOutputStream(file)));
			}

			else if (str.equalsIgnoreCase("end")) {
				System.out.println("���� �Ϸ�!");
				soc.close();
				break;
			} else if (file != null) {
				dos.write(str.getBytes(), 0, str.getBytes().length);
			}
		}
		dos.close();
	}

}
