package code.threaddemo;

class Hi extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("Hi");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("Hello");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Hi hiObj = new Hi();
		Hello helloObj = new Hello();

		hiObj.start();
		Thread.sleep(10);
		helloObj.start();
	}
}
