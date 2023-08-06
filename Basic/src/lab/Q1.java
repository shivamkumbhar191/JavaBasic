package lab;

public class Q1 {
	
	public void insert() {
		System.out.println("i am form insert");
	}
	public void display() {
		System.out.println("i am form display");
	}
	public void deposit() {
		System.out.println("i am form deposit");
	}
	public void withdraw() {
		System.out.println("i am form withdraw");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 m= new Q1();
		m.deposit();
		m.withdraw();
		m.display();
		m.insert();

	}

}
