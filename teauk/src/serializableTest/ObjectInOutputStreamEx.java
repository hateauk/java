package serializableTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInOutputStreamEx {

	
	public static void main(String[] args) {
		
		ObjectInputStream ois=null;
		ObjectOutputStream oos=null;
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try{
			fos=new FileOutputStream("d:\\object.ser");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(new Customer("гоеб╩м"));
			fis=new FileInputStream("d:\\object.ser");
			ois=new ObjectInputStream(fis);
			Customer m=(Customer)ois.readObject();
			System.out.println("m="+m);
		}catch(IOException ioe){
			ioe.printStackTrace();
			
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}finally{
			
			try{
				if(fis!=null)fis.close();
				if(ois!=null)ois.close();
				if(fos!=null)fos.close();
				if(oos!=null)ois.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
		
		
		

	}

}
