package interfaceTest;

public class LocalInner {

	int a=100;//member variable
	
	public void innerTest(int k){
		
		int b=200; //local variable;
		final int c=k;//constant
		class Inner{
			
			//local 내부 클래스는 외부 클래스의 멤버 변수와 상수만 접근 할 수 있다.
			
			public void getData(){
				System.out.println("int a : "+a);
				//System.out.println("int b : "+ b);
				//local 내부 클래스는 지역변수를 사용할 수 없다.
				
				System.out.println("final int c :"+c);
			}
			
			
		}//.end inner
		
		Inner i =new Inner(); //메서드 내에서 local 내부 클래스 생성
		i.getData();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalInner outer=new LocalInner();
		outer.innerTest(1000);

	}

}
