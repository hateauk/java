package exceptionTest;

public class ExceptionEx1 {


	public static void main(String[] args) {

		
		int[] var= {10,200,30};
		for(int i=0; i<=3;i++){
			
			try{
				
			System.out.println((i+1)+"번째");	
			System.out.println("Var["+i+"]:"+var[i]);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			}catch(Exception e){
				System.out.println("배열한도 초과했다");
				return;
				
			}finally{
				System.out.println("리턴문장이 있어도 수행되는 파이널리");
			}
		}
		
		/*for(int n:var){
			
			System.out.println("var["+var+"]:"+n);
		}*/
		
		System.out.println("프로그램 끝!");
	}

}
