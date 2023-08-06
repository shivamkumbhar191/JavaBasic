package oops;
 
class Vehicle{
	
	public void run() {
		System.out.println("vehicle is running");
	}
	
	
}

class Carr extends Vehicle{
	@Override
	public void run() {
		System.out.println("car is running");
		super.run();
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carr c= new Carr();
		c.run();

	}

}
