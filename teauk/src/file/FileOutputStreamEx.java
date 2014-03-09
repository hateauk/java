package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException{

		FileOutputStream fos=null;
		try{
			//fos=new FileOutputStream("d:\\fileout.txt");
			fos=new FileOutputStream("d:\\fileout.txt",true);
			String message="hello fileoutstream!!";
			
			fos.write(message.getBytes());
			
			
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(fos!=null)fos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			
		}
		

	}

}
