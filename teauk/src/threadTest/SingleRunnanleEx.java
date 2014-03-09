package threadTest;

public class SingleRunnanleEx implements Runnable {

	private int temp[];
	
	public SingleRunnanleEx(){
		temp=new int[10];
		for(int start=0;start<10;start++){
			temp[start]=start;
		}
	}
	
	@Override
	public void run() {
		
		for(int start:temp){
			try{
				Thread.sleep(600);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			System.out.printf("스레드 이름: %s, ",Thread.currentThread().getName());
			System.out.printf("temp value : %d %n" ,start);
		}
		

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		SingleRunnanleEx srt=new SingleRunnanleEx();
		Thread t=new Thread(srt,"첫번째");
		t.run();

	}

}
