package exception;

class InsufficientBalanceException extends RuntimeException
{
	public InsufficientBalanceException() {
		super();
	}
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
public class Balance {
	
	public static void checkbalance(int balance)  {
		if(balance<1000) {
			throw new InsufficientBalanceException("balance is insufficient");	
		}
		else {
			System.out.println("balance is sufficient");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ajay";
		String balance="1500A";
		
		try {
			checkbalance(Integer.parseInt(balance));
		}
		catch(NumberFormatException e) {
			System.out.println(e);
			
		}
		catch(InsufficientBalanceException e2) {
			System.out.println(e2.getLocalizedMessage());
		}
		finally {
			System.out.println("handled");
		}
		
		System.out.println("done...");

	}

}
