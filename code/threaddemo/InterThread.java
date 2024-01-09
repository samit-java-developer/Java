package code.threaddemo;

class Q {
	int num;
	boolean valueSet = true;

	public synchronized void put(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (Exception e) {
			}
			;
		}
		System.out.println("Put : " + num);
		this.num = num;
		valueSet = true;
		notify();
	}

	public synchronized void get() {
		while (!valueSet) {
			try {
				wait();
			} catch (Exception e) {
			}
			;
		}
		System.out.println("Get : " + num);
		valueSet = false;
		notify();
	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		// Thread t = new Thread(this, "Producer");
		// t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			;
		}
	}
}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		// Thread t = new Thread(this, "Consumer");
		// t.start();
	}

	@Override
	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			;
		}
	}
}

public class InterThread {

	public static void main(String[] args) {

		Q q = new Q();
		Thread t1 = new Thread(new Producer(q), "Producer");
		Thread t2 = new Thread(new Consumer(q), "Consumer");
		t1.start();
		t2.start();
	}
}
