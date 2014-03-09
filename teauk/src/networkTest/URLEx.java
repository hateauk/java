package networkTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class URLEx {


	public static void main(String[] args) throws MalformedURLException, IOException{
		

		URL url=new URL("http", "java.sun.com", 8800,"index.jsp?name=syh1011#content");
		
		String protocol=url.getProtocol();
		
		String host=url.getHost();
		
		int port=url.getPort();
		
		int defaultport=url.getDefaultPort();
		
		String path=url.getPath();
		
		String query=url.getQuery();
		
		String ref=url.getRef();
		
		String _url=url.toExternalForm();
		
		String mixUrl=null;
		
		
		
		if(port==-1){
			mixUrl=protocol+ "//" +host +path +"?"+query + "#"+ ref;
		}else{
			mixUrl=protocol+ "//" +host +":"+port+ path +"?"+query + "#"+ ref;
		}
		
		if(port==-1){
			port=url.getDefaultPort();
		}
		
		
		
		
		
		System.out.printf("프로토콜: %s %n", protocol);
		System.out.printf(" 호스트: %s %n",host);
		System.out.printf(" 포트: %s %n",port);
		System.out.printf(" 패스: %s %n",path);
		System.out.printf(" 쿼리: %s %n",query);
		System.out.printf(" ref: %s %n",ref);
		System.out.printf(" mixurl: %s %n",mixUrl);
		System.out.printf(" URL: %s %n",_url);
		
		url=new URL("http://www.daum.net");
		InputStream input=url.openStream();
		
		int readByte;
		System.out.println("=======문서의 내용==========");
		while(((readByte=input.read())!=-1)){
			System.out.print((char)readByte);
		}

		input.close();
		
		
		
		
	}

}
