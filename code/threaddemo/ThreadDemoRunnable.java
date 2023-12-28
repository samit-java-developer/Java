package code.threaddemo;

public class ThreadDemoRunnable {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				try {
					System.out.println("Hi " + Thread.currentThread().getPriority());
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				try {
					System.out.println("Hello " + Thread.currentThread().getPriority());
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		Thread.sleep(10);
		t2.start();

		t1.join();
		t2.join();

		System.out.println(t1.isAlive());
		System.out.println("Bye");
	}
}
