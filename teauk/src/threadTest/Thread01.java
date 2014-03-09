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
	      setPriority(priority); //�켱������ �ο��Ѵ�: �������� ���� �ƴϴ�.
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
	         //getPriority() method�� Thread�� �켱������ �˰� ���� �� ȣ���Ѵ�.
	         System.out.println(i+" : "+getName()+" �켱����: "+getPriority());
	      }
	   }
	   public static void main(String[] args) 
	   {  
	      Thread t1 = new Thread01("1st Thread", Thread.NORM_PRIORITY); //���� �켱��
	      Thread t2 = new Thread01("2nd Thread", Thread.MAX_PRIORITY); //�ִ� �켱��
	      Thread t3 = new Thread01("3rd Thread", Thread.MIN_PRIORITY); //�ּ� �켱��

	      t1.start();
	      t2.start();
	      t3.start();
	   }
	}