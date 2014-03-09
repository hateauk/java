package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		try{
			fr=new FileReader("d:\\bufferReader.txt");
			br=new BufferedReader(fr);
			String msg;
			while((msg=br.readLine())!=null){
				System.out.println(msg);
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				if(fr!=null)fr.close();
				if(br!=null)br.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
