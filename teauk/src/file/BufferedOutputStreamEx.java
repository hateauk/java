package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {


	public static void main(String[] args) {
	
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try{
			
			fos=new FileOutputStream("d:\\bufferOut.txt");
			bos=new BufferedOutputStream(fos);
			String str="bufferedoutputstream test ¿‘¥œ¥Ÿ.";
			bos.write(str.getBytes());
			bos.flush();
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(fos!=null)fos.close();
				if(bos!=null)bos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}

	}

}
