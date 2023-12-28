package code.threaddemo;

class Counter {
	int count;
	public synchronized void increment() {
		count++; // count=count+1;
	}
	// if you want to make one thread at a time will execute the above method then
	// you will have to make it synchronized.
}

public class SyncDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Count : " + c.count);
	}

}
