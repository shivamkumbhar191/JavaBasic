package lab;

abstract class Bank {
	Bank() {
		System.out.println("State bank of india");
	}

	Bank(int n) {
		System.out.println("ifsc = SBIN0030090");
	}
	abstract void balance();

}
class Sbi extends Bank {

	Sbi() {
		super();
		// super(4000);
		this.balance();
	}

	@Override
	void balance() {
		System.out.println("i am from sbi");
	}

}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
