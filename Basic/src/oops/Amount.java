package oops;

public class Amount {
	
	long accountNo;
	String customerName;
	
	public Amount(long accountNo)
	{
		this.accountNo=accountNo;
		System.out.println(accountNo);
	}
	public Amount() {
		customerName="surya";
		System.out.println(customerName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amount amt=new Amount(629102728);
		Amount amt1=new Amount();
		

	}

}
