package code.corejava.course;

public class Hello {
	public static void main(String[] args) {

		byte b = 127;
		int a = b;
		byte k = (byte) a;
		System.out.println(k);
		System.out.println(a);

		float f = 7.6f;
		int t = (int) f;
		System.out.println(t);

		byte a1 = 10;
		byte b1 = 30;
		int result = (byte) (a1 * b1);

		System.out.println(result);

	}
}