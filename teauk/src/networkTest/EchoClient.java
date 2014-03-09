package networkTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import file.OutputStreamEx;

public class EchoClient {

	private  String ip;
	private  int port;
	private String str;
	BufferedReader file;
	public EchoClient(String ip, int port)throws IOException{
		
		this.ip=ip;
		this.port=port;
		Socket tcpsocket=getSocket();
		
		OutputStream os_socket=tcpsocket.getOutputStream();
		InputStream is_socket=tcpsocket.getInputStream();
		
		
		
		BufferedWriter bufferW=new BufferedWriter(new OutputStreamWriter(os_socket));
		BufferedReader bufferR=new BufferedReader(new InputStreamReader(is_socket));
		
		System.out.print("ют╥б : ");
		file= new BufferedReader(new InputStreamReader(System.in));
		
		str=file.readLine();
		str+=System.getProperty("line.separator");
		bufferW.write(str);
		bufferW.flush();
		str=bufferR.readLine();
		System.out.println("echo result :" +str);
		
		file.close();
		bufferW.close();
		
		bufferR.close();
		tcpsocket.close();

	}
	
	
	public Socket getSocket(){
		Socket tcpsoSocket=null;
		try{
			
			tcpsoSocket =new Socket(ip,port);
		}catch(IOException ioe){
			ioe.printStackTrace();
			System.exit(0);
		}
		
		return tcpsoSocket;
	}
	
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 new EchoClient("192.168.0.5",3002);
	}

}
