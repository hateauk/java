package teaukpractice;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {


	 StringTokenizer st;
	
	public StringTokenizerEx1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringTokenizerEx1(String str){
		
		System.out.println("str: "+str);
		this.st=new StringTokenizer(str);
	}
	
	public StringTokenizerEx1(String str,String delim){
		
		System.out.println("str: "+str);
		st=new StringTokenizer(str,delim);
		
	}
	
	public void print(){
		
		System.out.println("token count: "+st.countTokens() );
		while(st.hasMoreElements()){
			String token=st.nextToken();
			System.out.println(token);
			
		}
		System.out.println("----------------------------------------");
		
	}
	
	
	
	public static void main(String[] args) {
	
		StringTokenizerEx1 st1=new StringTokenizerEx1("happy day");
		st1.print();
		
		StringTokenizerEx1 st2=new StringTokenizerEx1("2014/02/01","/");
		st2.print();
		
		
	}

}
