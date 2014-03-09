package teaukpractice;

import java.util.StringTokenizer;

public class StringTokenzerEx2 {


	public static void main(String[] args) {
	

		System.out.println("===========spilt 테스트 ===========");
		
		String date="2014//02/01/";
		String [] sp=date.split("/", 5);
		for(int i=0;i<sp.length;i++){
			
			System.out.println("sp["+i+"] : "+sp[i]);
		}
		
		
		System.out.println("===========stringtokenizer 테스트 ================");
		
		
		StringTokenizer st=new StringTokenizer(date,"/");
		
		int index=0;
		while(st.hasMoreElements()){
			
			String token=st.nextToken();
			System.out.println("st"+index+": " +token);
			index++;
		}
		
	}

}
