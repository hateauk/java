package networkTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		InetAddress addr=InetAddress.getLocalHost();
		
		System.out.printf("ȣ��Ʈ �̸� : %s",addr.getHostName());
		System.out.printf("ȣ��Ʈ ip �ּ�  : %s %n",addr.getHostAddress());
	
		addr=InetAddress.getByName("www.daum.net");
		
		System.out.printf("ȣ��Ʈ �̸� : %s",addr.getHostName());
		System.out.printf("ȣ��Ʈ ip �ּ�  : %s %n",addr.getHostAddress());
		
		
		InetAddress [] sw=InetAddress.getAllByName("http://www.naver.com");
		
		for(InetAddress temp_sw: sw){
			
			System.out.printf("ȣ��Ʈ �̸�: % s",temp_sw.getHostName());
			System.out.printf("ȣ��Ʈ  ip �ּ�: % s %n",temp_sw.getHostAddress());
		}
		
		
	}

}
