package threadTest;

class SuperThreadPriority extends Thread {

	public SuperThreadPriority(String threadName) {
		super(threadName);
	}

	public void run() {
		System.out.printf("스레드 이름:%s %n", Thread.currentThread().getName());
	}

}

public class PriorityChangeEx extends SuperThreadPriority {

	public PriorityChangeEx(String threadName) {
		super(threadName);
	}

	public static void main(String[] args) {

		Thread t1 = new SuperThreadPriority("첫번째 쓰레드");
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start();
//왜 책대로 안되는거냐
		Thread t2 = new SuperThreadPriority("두번째 스레드");

		t2.start();
	}

}
