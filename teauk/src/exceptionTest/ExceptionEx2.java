package exceptionTest;

public class ExceptionEx2 {

	
	public static void main(String[] args) {
		
		int var=50;
		try{
			int data=0;
			System.out.println(var/data);
		}catch(NumberFormatException ne){
			System.out.println("숫자가 아닙니다.");
		}catch(ArithmeticException ae){
			System.out.println("0으로 나눌순 없죠");
		}
		System.out.println("프로그램 종료");
	}

}
