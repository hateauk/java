package exceptionTest;

public class ExceptionEx1 {


	public static void main(String[] args) {

		
		int[] var= {10,200,30};
		for(int i=0; i<=3;i++){
			
			try{
				
			System.out.println((i+1)+"��°");	
			System.out.println("Var["+i+"]:"+var[i]);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			}catch(Exception e){
				System.out.println("�迭�ѵ� �ʰ��ߴ�");
				return;
				
			}finally{
				System.out.println("���Ϲ����� �־ ����Ǵ� ���̳θ�");
			}
		}
		
		/*for(int n:var){
			
			System.out.println("var["+var+"]:"+n);
		}*/
		
		System.out.println("���α׷� ��!");
	}

}
