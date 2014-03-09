package udpNetworkTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UnicastServerThread implements Runnable{

	private Socket socket;
	private BufferedReader bufferR;
	
	private BufferedWriter bufferW;
	private InputStream is;
	private OutputStream os;
	
	private String message;
	public UnicastServerThread(Socket socket){
		this.socket=socket;
	}
	
	
	@Override
	public void run() {
		boolean isStop=false;
		try{
			is=socket.getInputStream();
			os=socket.getOutputStream();
			bufferR=new BufferedReader(new InputStreamReader(is));
			bufferW=new BufferedWriter(new OutputStreamWriter(os));
		}catch(IOException e){isStop= true;}
		
		try{
			while(!isStop){
				String message=bufferR.readLine();
				if(message.equals("exit")){isStop=true;}
				System.out.println("received message: "+message);
				message+=System.getProperty("line.separator");
				bufferW.write(message);
				bufferW.flush();
			}//while end
		}catch(IOException e){
			System.out.println("클라이언트가 강제로 종료되었습니다하");
			
			isStop=true;
		}finally{
			
			try{
				if(bufferR!=null)bufferR.close();
				if(bufferW!=null)bufferW.close();
				if(socket!=null)socket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}//end finally
		
		
	}//end run


}
