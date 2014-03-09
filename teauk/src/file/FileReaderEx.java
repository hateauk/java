package file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		FileReader fr=null;
		try{
			
			fr=new FileReader("d:\\fileReader.txt");
			int readChar;
			while((readChar=fr.read())!=-1){
				
				System.out.print((char)readChar);
			}
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				if(fr!=null)fr.close();
			}catch (IOException ioe){
				ioe.printStackTrace();
			}
		}
		
		

	}

}
