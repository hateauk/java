package file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

public class DataOutputStreamEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
	
		
		FileInputStream fis=null;
		DataInputStream dis=null;
		FileOutputStream fos= null;
		DataOutputStream dos=null;
		
		try{
			fos=new FileOutputStream("d:\\dataout.txt");
			dos=new DataOutputStream(fos);
			dos.writeBoolean(false);
			dos.writeInt(20000);
			dos.writeChar('t');
			dos.writeDouble(23.1412);
			fis=new FileInputStream("d:\\dataout.txt");
			dis=new DataInputStream(fis);
			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
		
	
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			
			try{
				if(fis!=null)fis.close();
				if(fis!=null)dis.close();
				if(fis!=null)fis.close();
				if(fis!=null)fos.close();
				if(fis!=null)dos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			
			
			
		}
		

	}

}
