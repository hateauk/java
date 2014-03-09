package file;

import java.io.File;
import java.io.IOException;

public class FileEx {


	public static void main(String[] args) throws IOException{
		
		String filePath="d:"+System.getProperty("file.separator");
		
		File f1=new File(filePath);//루트 경로 저장
		String list[]=f1.list();//루트경로에 있는 모든 파일과 디렉토리를 배열에 저장 
		
		for(int i=0;i<list.length;i++){
			File f2=new File(filePath, list[i]);//루트경로와 루트하위 경로를 연결한 값을 지닌 파일 객체를 생성
			if(f2.isDirectory()){
				System.out.printf("%s : 디렉토리 %n ", list[i]);
			}else{
				System.out.printf("%s : 파일 (% ,dbyte) %n", list[i], f2.length());
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
