package networkTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoServer {

	
	
	public UDPEchoServer(int port) {
		super();
		// TODO Auto-generated constructor stub
		
		try{
			DatagramSocket ds =new DatagramSocket(port);
			while(true){
				byte []buffer= new byte[512];
				DatagramPacket dp=new DatagramPacket(buffer, buffer.length);
				System.out.println("ready");
				ds.receive(dp);
				String str=new String(dp.getData());
				System.out.println("수신된 데이터 : "+str);
				
				InetAddress ia=dp.getAddress();
				port=dp.getPort();
				System.out.println("client ip:"+ia+",client port: "+port);
				dp=new DatagramPacket(dp.getData(), dp.getData().length,ia,port);
				ds.send(dp);
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UDPEchoServer(8898);
	}

}
