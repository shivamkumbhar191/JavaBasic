package exception;

class InvalidNumException extends Exception {
	public InvalidNumException() {
		super();
	}

	public InvalidNumException(String msg) {
		super(msg);
	}
}

class InvalidLengthExceprion extends Exception {
	public InvalidLengthExceprion() {
		super();
	}

	public InvalidLengthExceprion(String msg) {
		super(msg);
	}
}

class InvalidSumException extends Exception{
	public InvalidSumException() {
		super();
	}
	public InvalidSumException(String msg) {
		super(msg);
	}
}

public class StringException {

	public static void checknum(String s) throws InvalidLengthExceprion, InvalidSumException, InvalidNumException {
		int digit = s.length();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				count++;

			}

		}

		int firstsum = 0;
		int lastsum = 0;

		for (int j = 0; j < 3; j++) {
			firstsum = firstsum + s.charAt(j);
		}

		for (int k = s.length() - 1; k > s.length() - 4; k--) {
			lastsum = lastsum + s.charAt(k);
		}

		if (digit != count) {
			throw new InvalidNumException("invalid number");
		} 
		else if (count < 3) {
			throw new InvalidLengthExceprion("minimum length");
		}
		else if (firstsum == lastsum) {
			System.out.println("valid number");
		} 
		else {
			throw new InvalidSumException("Addition of first three and last three digit not same"); 
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num = "123756124";
		try {
			checknum(num);
		} catch (InvalidNumException e1) {
			System.out.println(e1.getMessage());

		} catch (InvalidLengthExceprion e2) {
			System.out.println(e2.getMessage());
		}
		catch(InvalidSumException e3) {
			System.out.println(e3.getMessage());
		}
		System.out.println("Verify...");

	}

}
