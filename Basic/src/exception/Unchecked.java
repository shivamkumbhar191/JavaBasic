package exception;

public class Unchecked {

	public static void m1(int c) {
		throw new ArithmeticException("divide by zero");
	}

	public static void m2(int c) {
		m1(c);
	}

	public static void m3(int c) {
		m2(c);
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		try {
			m3(a/b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("done...");

	}

}
