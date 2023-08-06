package exception;

class InvalidStringException extends Exception {
	public InvalidStringException() {
		super();

	}

	public InvalidStringException(String message) {
		super(message);
	}

}

public class CustomException {

	public static void checkedname() throws InvalidStringException {
		String sname = "rohan54";
		int digit = 0;

		for (int i = 0; i < sname.length(); i++) {
			if (sname.charAt(i) >= '0' && sname.charAt(i) <= '9') {
				digit++;
			}
		}
		//System.out.println("number of digits :"+digit);
		
		if (digit > 0) {
			throw new InvalidStringException("invalid name");
		} else {
			System.out.println("valid name");
		}

	}

	public static void main(String[] args) {
		
		try {
			checkedname();
		} catch (InvalidStringException sx) {
			System.out.println(sx.getMessage());

		}
		System.out.println("handled");

	}

}
