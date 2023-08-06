package oops2;

class Car{
	public  void display() {
		System.out.println("car");
	}
	public  void display(float c) {
		System.out.println("car");
	}
	
}
class BMW extends Car{
	@Override
	public  void display() {
		System.out.println("BMW");
	}
	@Override
	public void display(float b) {
		System.out.println(b);
	}
	public void display(int b) {
		System.out.println(b);
	}
	
}

public class StaticInherited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		

	}

}
