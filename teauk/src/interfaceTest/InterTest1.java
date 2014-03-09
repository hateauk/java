package interfaceTest;


interface InterTest{
static  int a=100;
abstract int getA();

}

public class InterTest1 implements InterTest{


	public int getA(){
		return a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterTest1 it1=new InterTest1();
		System.out.println(it1.getA());
		
	}

}
