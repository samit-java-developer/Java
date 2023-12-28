package code.multithreading.join;

public class JoinMethod2 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		JoinMethod2 t1 = new JoinMethod2();
		JoinMethod2 t2 = new JoinMethod2();
		JoinMethod2 t3 = new JoinMethod2();
		t1.start();
		try {
			t1.join(25000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
