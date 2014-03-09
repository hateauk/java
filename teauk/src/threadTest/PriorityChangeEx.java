package threadTest;

class SuperThreadPriority extends Thread {

	public SuperThreadPriority(String threadName) {
		super(threadName);
	}

	public void run() {
		System.out.printf("������ �̸�:%s %n", Thread.currentThread().getName());
	}

}

public class PriorityChangeEx extends SuperThreadPriority {

	public PriorityChangeEx(String threadName) {
		super(threadName);
	}

	public static void main(String[] args) {

		Thread t1 = new SuperThreadPriority("ù��° ������");
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start();
//�� å��� �ȵǴ°ų�
		Thread t2 = new SuperThreadPriority("�ι�° ������");

		t2.start();
	}

}
