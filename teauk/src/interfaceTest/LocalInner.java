package interfaceTest;

public class LocalInner {

	int a=100;//member variable
	
	public void innerTest(int k){
		
		int b=200; //local variable;
		final int c=k;//constant
		class Inner{
			
			//local ���� Ŭ������ �ܺ� Ŭ������ ��� ������ ����� ���� �� �� �ִ�.
			
			public void getData(){
				System.out.println("int a : "+a);
				//System.out.println("int b : "+ b);
				//local ���� Ŭ������ ���������� ����� �� ����.
				
				System.out.println("final int c :"+c);
			}
			
			
		}//.end inner
		
		Inner i =new Inner(); //�޼��� ������ local ���� Ŭ���� ����
		i.getData();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalInner outer=new LocalInner();
		outer.innerTest(1000);

	}

}
