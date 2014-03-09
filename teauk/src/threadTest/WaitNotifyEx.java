package threadTest;

class ATMTwo implements Runnable{
	
	private long depositeMoney=10000;
	public void run(){
		
		synchronized(this){
			for(int i=0;i<10;i++){
				if(getDepositeMoney()<=0) break;
				withDraw(1000);
				
				if(getDepositeMoney()==2000||getDepositeMoney()==4000||getDepositeMoney()==6000||getDepositeMoney()==8000){
					
					try{
						this.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
				
				
			}else {
				this.notify();
			}
		}
	}//end synchronized
	
}//end run


	public void withDraw(long howMuch){
		
		if(getDepositeMoney()>0){
			
			depositeMoney-=howMuch;
			System.out.print(Thread.currentThread().getName()+",");
			System.out.printf("ÀÜ¾×: %d¿ø %n ", getDepositeMoney());
		}else{
			System.out.print(Thread.currentThread().getName()+",");
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇØ");
		}
		
		
		
		
		
		
	}//end howMuch


	public long getDepositeMoney(){
		
		return depositeMoney;
	}
	


}
public class WaitNotifyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATMTwo atm=new ATMTwo();
		Thread mother = new Thread(atm,"mother");
		
		Thread  son = new  Thread(atm, "son");
		
		mother.start();
		son.start();
		
		
	}

}
