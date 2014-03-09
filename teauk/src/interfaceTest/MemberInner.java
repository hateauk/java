package interfaceTest;

public class MemberInner {

	int a=10;
	private int b=100;
	static int c=200;
	
	class Inner{//내부 클래스 정의
		
		public void printData(){
			System.out.println("a값="+a);
			System.out.println("b값="+b);
			System.out.println("c값="+c);
			
			
		}
	}
	
	
	public static void main(String[] args) {
	

		
	
		MemberInner.Inner inner=new MemberInner().new Inner();
		inner.printData();
		
	}

}
