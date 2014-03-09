package threadTest;

public class ThreadEx1  extends Thread{

	public void run(){
		System.out.println("스레드가 구동 ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ThreadEx1 threadEx1=new ThreadEx1();
		
		
		
		threadEx1.start();
		
		System.out.println(threadEx1.currentThread().getName());
		
	}

}
