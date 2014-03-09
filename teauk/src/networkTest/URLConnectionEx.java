package networkTest;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class URLConnectionEx {

	public static void main(String[] args) throws Exception{
		
		URL url=new URL("http://juneny.wo.tc/426");
		URLConnection urlCon=url.openConnection();
		urlCon.connect();
		
		Map<String,List<String>>map = urlCon.getHeaderFields();
		Set<String> s=map.keySet();
		
		Iterator<String> iterator=s.iterator();
		while(iterator.hasNext()){
			
			String name=iterator.next();
			System.out.print(name+":");
			List<String> value=map.get(name);
			for(String _temp: value)
			System.out.println(_temp);
		}

	int len=urlCon.getContentLength();
	System.out.println("문서의 길이 : "+len + "바이트 ");
	if(len>0){
		
		InputStream input=urlCon.getInputStream();
		
		int readByte;
		
		System.out.println("=========문서의 내용 =============");
		while(((readByte =input.read())!=-1)&&(--len>0)){
			System.out.print((char)readByte);
		}
		input.close();
		
		
		
	}else{
		System.out.println("내용이 없음");
	}
		
		
		
	}

}
