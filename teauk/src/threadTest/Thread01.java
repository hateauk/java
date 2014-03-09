package threadTest;



	class Thread01  extends Thread
	{
		Thread01()
	   {
	   }
		Thread01(String name)
	   {
	      super(name);
	   }
		Thread01(String name, int priority)
	   {
	      super(name);
	      setPriority(priority); //우선순위를 부여한다: 절대적인 것은 아니다.
	   }
	   public void run()
	   {
	      int i = 0;
	      while (i++ < 10)
	      {
	       try
	         {
	            sleep(100);
	         }
	         catch (Exception e)
	         {
	         }
	         //getPriority() method는 Thread의 우선순위를 알고 싶을 때 호출한다.
	         System.out.println(i+" : "+getName()+" 우선순위: "+getPriority());
	      }
	   }
	   public static void main(String[] args) 
	   {  
	      Thread t1 = new Thread01("1st Thread", Thread.NORM_PRIORITY); //보통 우선권
	      Thread t2 = new Thread01("2nd Thread", Thread.MAX_PRIORITY); //최대 우선권
	      Thread t3 = new Thread01("3rd Thread", Thread.MIN_PRIORITY); //최소 우선권

	      t1.start();
	      t2.start();
	      t3.start();
	   }
	}