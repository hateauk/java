package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterFirstEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileWriter fw= null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try{
			fw=new FileWriter("d:\\testStream"+System.getProperty("file.separator")+"printWriterFirst.txt");
			bw=new BufferedWriter(fw);
			pw= new PrintWriter(bw,true);
			pw.println("æ»≥Á«œººø‰");
			pw.println("π›∞©Ω¿¥œ¥Ÿ.");
			pw.println(100);
			pw.println(new Integer("1000"));
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			
			try{
				if(fw!=null) fw.close();
				if(bw!=null)bw.close();
				if(pw!=null)pw.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
