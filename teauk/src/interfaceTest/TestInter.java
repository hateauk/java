package interfaceTest;

public interface TestInter {

	int data=100;
	public void printData();
	



class AnonyInner{
	
	public void test(){
		
		new TestInter(){
			public void printData(){//�̿ϼ� �� ���� �ϼ��Ѵ�.
				
			System.out.println("data:"+data);	
			}
			
			
		}.printData();
		
	}
	public static void main(String[] args){
		AnonyInner ai=new AnonyInner();
		ai.test();
		
	}
}
}