package exception;

class InvalidBinaryException extends Exception {
	public InvalidBinaryException() {
		super();
	}

	public InvalidBinaryException(String msg) {
		super(msg);
	}
}

public class BinaryException {
	public static void checkbinary(int num) throws InvalidBinaryException {
		boolean b = true;
		while (num > 0) {
			int digit = num % 10;
			if (digit != 0 && digit != 1) {
				b = false;
			}
			num = num / 10;
		}

		if (b == true) {
			System.out.println("binary number");
		} else {
			throw new InvalidBinaryException("number is not binary");
		}

	}

	public static void binarytodecimal(int num) {

		int base = 2;
		int dec = 0;

		while (num > 0) {
			int digit = num % 10;
			for (int j = 2; j > 0; j--) {
				dec = dec + digit * (base ^ j);

			}
			num = num / 10;
			
		}
		System.out.println(dec);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 111;
		binarytodecimal(num);

		try {
			checkbinary(num);

		} catch (InvalidBinaryException e) {
			System.out.println(e.getMessage());

		}
		System.out.println("done...");

	}

}
