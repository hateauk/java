package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		FileWriter fw=null;
		try{
			fw=new FileWriter("d:\\testStream\\filewriter.txt");
			String message="¾È³çÇÏ¼¼¿ë filewriter test";
			fw.write(message);
		}catch(IOException io){
			io.printStackTrace();
		}finally{
			try{if(fw!=null)fw.close();
			
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
