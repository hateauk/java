package threadTestFinal;

public class Customer implements Runnable {


	private Car car;

	public Customer(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String carName=null;
		for(int i=0;i<20;i++){
			carName=car.pop();
			try{
				Thread.sleep((int)Math.random()*2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
