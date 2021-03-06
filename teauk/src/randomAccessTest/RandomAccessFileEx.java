package randomAccessTest;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

	public static void main(String[] args) {
		RandomAccessFile ra=null;
		
		try{
			ra= new RandomAccessFile("d:\\random.txt", "rw");
			
			String receive="우하하하";
			ra.seek(ra.length()+1);
			ra.write(receive.getBytes());
			byte[] buf=new byte[(int)ra.length()];
			ra.seek(0);
			ra.read(buf);
			System.out.print("처음 읽은 내용:");
			System.out.println(new String(buf));
			ra.seek(0);
			ra.read(buf);
			System.out.println("다시 읽은 내용: ");
			System.out.println(new String(buf));
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			
			try{
				if(ra!=null)ra.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}

	}

}
