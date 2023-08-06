package onextel;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("OneXTel");
			} else if (i % 3 == 0) {
				System.out.println("OneX");
			} else if (i % 5 == 0) {
				System.out.println("Tel");
			}
			else {
				System.out.println(i);
			}

		}
	}

}
