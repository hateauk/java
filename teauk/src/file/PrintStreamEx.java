package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		PrintStream ps=null;
		
		try{
			
			fos=new FileOutputStream("d:\\printStream.txt");
			bos=new BufferedOutputStream(fos);
			ps=new PrintStream(bos,true);
			ps.println("гоеб╩м");
			ps.println(1234);
			ps.println(true);
			ps.println('a');
			
			
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
		
		try{
			if(fos!=null)fos.close();
			if(bos!=null)bos.close();
			if(ps!=null)ps.close();
			
		}catch(IOException io){
			io.printStackTrace();
		}
		}
	}

}
