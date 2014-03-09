package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {


	public static void main(String[] args) {
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		try{
			fw=new FileWriter("d:\\testStream\\bufferWriter.txt");
			bw=new BufferedWriter(fw);
			bw.write("bufferedWriter테스트입니다. " );
			bw.newLine();
			
			bw.write("안녕하세요 " + System.getProperty("line.separator"));
			bw.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			
			try{
				if(fw!=null)fw.close();
			if(bw!=null)bw.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}

	}

}
