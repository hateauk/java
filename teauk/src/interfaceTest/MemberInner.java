package interfaceTest;

public class MemberInner {

	int a=10;
	private int b=100;
	static int c=200;
	
	class Inner{//���� Ŭ���� ����
		
		public void printData(){
			System.out.println("a��="+a);
			System.out.println("b��="+b);
			System.out.println("c��="+c);
			
			
		}
	}
	
	
	public static void main(String[] args) {
	

		
	
		MemberInner.Inner inner=new MemberInner().new Inner();
		inner.printData();
		
	}

}
