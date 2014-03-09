package networkTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {

	private String str;
	private BufferedReader file;
	private static int SERVERPORT=3001;
	public UDPEchoClient(String ip, int port){
		try{
			InetAddress ia=InetAddress.getByName(ip);
			DatagramSocket ds=new DatagramSocket(port);
			System.out.println("message:");
			file=new BufferedReader(new InputStreamReader(System.in));
			str=file.readLine();
			byte [] buffer=str.getBytes();
			DatagramPacket dp=new DatagramPacket(buffer ,buffer.length,ia,SERVERPORT);
			ds.send(dp);//�۽��� ���� ������ �׷� ��Ŷ
			
			buffer=new byte[512];
			dp=new DatagramPacket(buffer, buffer.length);
			ds.receive(dp);
			System.out.println("server ip : "+ dp.getAddress()+ ", server port :"+dp.getPort());
			
			System.out.println("���ŵ� ������ :"+new String(dp.getData()).trim());
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 new UDPEchoClient("192.168.0.5", 8989);
		
		//new UDPEchoClient("localhost",2000);
		
		
	}

}
