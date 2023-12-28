package code.multithreading;

public class ThreadTester {

	public static void main(String[] args) {
		System.out.println("main is starting...");
		Thread1 thread1 = new Thread1("thread1");
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Inside " + Thread.currentThread().getName() + " " + i);
			}
		}, "thread2");

		thread1.start();
		thread2.start();
		System.out.println("main is exiting...");
	}
}
