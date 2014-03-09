package udpNetworkTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UnicastClient {

	private String ip ;
	private  int port;
	private  String message;
	private  BufferedReader file=null;
	private  BufferedWriter bufferW=null;
	private  BufferedReader bufferR=null;
	
	public UnicastClient(String ip, int port)throws IOException{
		
		this.ip=ip;
		this.port=port;
		boolean isStop=false;
		Socket tcpsocket=getsSocket();
		
		boolean result=false;
		result= tcpsocket.isConnected();
		
		if(!result){
			System.out.println("연결실패");
		}
		
		OutputStream os=tcpsocket.getOutputStream();
		InputStream is =tcpsocket.getInputStream();
		bufferW=new BufferedWriter(new OutputStreamWriter(os));
		bufferR=new BufferedReader(new InputStreamReader(is));
		
		while(!isStop){
			System.out.println("message :");
			file=new BufferedReader(new InputStreamReader(System.in));
			message=file.readLine();
			message+=System.getProperty("line.separator");
			bufferW.write(message);
			bufferW.flush();
			
			message=bufferR.readLine();
			if(message.equals("exit")){
				isStop=true;
				System.out.println("종료되었습니다.");
			}else{
				System.out.println("received message : "+message);
			}
				
			
		}//end while
		try{
		tcpsocket.close();
		bufferR.close();
		bufferW.close();
		file.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}//end UnicastClient
	
	
	public Socket getsSocket(){
		Socket tcpsocket=null;
		try{
			tcpsocket=new Socket(ip,port);
		}catch(IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		return tcpsocket;
	}
	
	
	public static void main(String[] args) throws IOException {
	 new UnicastClient("192.168.0.5", 3000);

	}

}
