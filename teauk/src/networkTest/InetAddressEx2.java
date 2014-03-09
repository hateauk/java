package networkTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx2 {

	public static void main(String[] ar) {
		InetAddress ia = null;  //�ּҸ� ��� ����  Ŭ����
		InetAddress []ia2 = null;
		try {
			ia = InetAddress.getByName("www.daum.net");
		System.out.println("server HostAddress : " + ia.getHostAddress());
			System.out.println("server HostName : " + ia.getHostName());
			System.out.println("--------------");
			ia = InetAddress.getLocalHost();
		System.out.println("local HostAddress : " + ia.getHostAddress());
			System.out.println("local HostName : " + ia.getHostName());
			System.out.println("--------------");
			ia2 = InetAddress.getAllByName("www.daum.net");
			for(InetAddress aa:ia2){
				System.out.println(aa.getHostAddress());
				System.out.println(aa.getHostName());
			}
		} 
		catch (UnknownHostException ee){
			System.err.println("�ش� ����Ʈ�� ��ȿ���� �ʽ��ϴ�.");
		}
	}
}



