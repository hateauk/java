package interfaceTest;


 class StaticInner {


	int a=10;
	private int b=100;
	static int c=200;
	
	static class Inner{
		
		//��¿�� ���� ���� Ŭ������ static ���� �����ؾ� �� ��찡 �ִ�.
		//�װ� �ٷ� ���� Ŭ������ ����� �� �ϳ��� 
		//static ����� �������� 
		
		static int d=1000;
		public void printData(){
			
			//System.out.println("int a : "+a);
			//System.out.println("private int b: "+b);
			System.out.println("static int c : "+ c );
		}
		
	}

	public static void main(String[] args) {
	

		
		//StaticInner.Inner inner=new StaticInner()
	//inner.printData();
		
	}

}
