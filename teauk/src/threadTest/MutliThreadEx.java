package threadTest;

public class MutliThreadEx implements Runnable {

	@Override
	public void run() {
		
		int first=0;
		int second=0;
		for (int i=0 ; i<20;i++){
			
			first++;
			second++;
			
			System.out.printf("first : %d, ",first);
			System.out.printf("second : %d, ", second);
			System.out.printf("�������̸�: %s %n ",Thread.currentThread().getName());
			
			
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MutliThreadEx srt1=new MutliThreadEx();
		
		Thread firstThread=new Thread(srt1,"ù��° ������");
		
		//firstThread.setPriority(Thread.MAX_PRIORITY);
		firstThread.start();
		
	 
		MutliThreadEx srt2=new MutliThreadEx();
		Thread secondThread= new Thread(srt2,"�ι�° ������");
		//secondThread.setPriority(Thread.MIN_PRIORITY);
		secondThread.start();
		
	}

}
