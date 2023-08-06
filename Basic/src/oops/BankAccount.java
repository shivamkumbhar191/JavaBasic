package oops;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetter gs=new GetterSetter();
		gs.setAccountNo(6291011);
		gs.setAccountName("shivam");
		gs.setAccountType("saving");
		gs.setBalance(500000);
		
		System.out.println(gs.getAccountNo());
		System.out.println(gs.getAccountType());
		System.out.println(gs.getAccountName());
		System.out.println(gs.getBalance());
		

	}

}
