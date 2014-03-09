package scannerTest;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ScannerURLConnectionEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		URLConnection urlCon=null;
		Scanner scan=null;
		
		try{
			
			urlCon=new URL("http:\\www.naver.com/"+"main.html").openConnection();
			
			scan=new Scanner(urlCon.getInputStream());
			scan.useDelimiter("\\z");
			String text=scan.next();
			System.out.println(text);
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{
			if(scan!=null)scan.close();
		}
		

	}

}
