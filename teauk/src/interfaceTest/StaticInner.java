package interfaceTest;


 class StaticInner {


	int a=10;
	private int b=100;
	static int c=200;
	
	static class Inner{
		
		//어쩔수 없이 내부 클래스를 static 으로 선언해야 할 경우가 있다.
		//그건 바로 내부 클래스의 멤버들 중 하나라도 
		//static 멤버가 있을때다 
		
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
