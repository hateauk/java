package exceptionTest;

public class ExceptionEx2 {

	
	public static void main(String[] args) {
		
		int var=50;
		try{
			int data=0;
			System.out.println(var/data);
		}catch(NumberFormatException ne){
			System.out.println("���ڰ� �ƴմϴ�.");
		}catch(ArithmeticException ae){
			System.out.println("0���� ������ ����");
		}
		System.out.println("���α׷� ����");
	}

}
