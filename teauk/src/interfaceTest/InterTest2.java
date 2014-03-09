package interfaceTest;


interface Inter1{
	public int getA();
	
}


interface Inter2{
	
	public int getA();
}

interface Inter3 extends Inter1, Inter2{
	
	public int getData();
}




public class InterTest2 implements Inter3 {
	
	int a=100;
	public int getA(){
		return a;
	}

	public int getData(){
		
		return a+10;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		InterTest2 it=new InterTest2();
		
		Inter1 it1=it;
		Inter2 it2=it;
		Inter3 it3=it;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
		System.out.println(it.toString());
		
		String res=null;
		if(it instanceof Inter2){
			res="맞다";
			
		}
		
		else{
			res="틀리다";
			
		}
		
		System.out.println(res);
		
	}

}
