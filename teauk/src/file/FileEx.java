package file;

import java.io.File;
import java.io.IOException;

public class FileEx {


	public static void main(String[] args) throws IOException{
		
		String filePath="d:"+System.getProperty("file.separator");
		
		File f1=new File(filePath);//��Ʈ ��� ����
		String list[]=f1.list();//��Ʈ��ο� �ִ� ��� ���ϰ� ���丮�� �迭�� ���� 
		
		for(int i=0;i<list.length;i++){
			File f2=new File(filePath, list[i]);//��Ʈ��ο� ��Ʈ���� ��θ� ������ ���� ���� ���� ��ü�� ����
			if(f2.isDirectory()){
				System.out.printf("%s : ���丮 %n ", list[i]);
			}else{
				System.out.printf("%s : ���� (% ,dbyte) %n", list[i], f2.length());
			}
		}
		
		
		File f3=new File("d:\\test.txt");
		System.out.println(f3.createNewFile());
		
		System.out.println(f3.getAbsolutePath());
		System.out.println(f3.getCanonicalPath());
		System.out.println(f3.getPath());
		System.out.println(f3.getName());
		System.out.println(f3.getParent());
		File f4= new File("d:\\test.txt");
		File f5= new File("d:\\test1.txt");

		System.out.println(f4.renameTo(f5));
	}

}
