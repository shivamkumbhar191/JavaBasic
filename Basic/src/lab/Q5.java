package lab;

class Kid {
	public void readBook() {
		System.out.println("Quntumm mechanics 1");

	}

	public void readBook(String name, int price) {

	}

}

class BigKid extends Kid {
	@Override
	public void readBook() {
		System.out.println("Quntumm mechanics 2");
  
	}

	@Override
	public void readBook(String name, int price) {
		System.out.println(name);

	}

}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid k= new BigKid();
		k.readBook();
		k.readBook("Attitude is everything", 600);

	}

}
