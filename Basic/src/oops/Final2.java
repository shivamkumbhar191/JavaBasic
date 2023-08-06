package oops;

class Car6{
	
	Car6(){
		System.out.println("constructor");
	}
	public final void show() {
		System.out.println("car");
	}
}
class Audi extends Car6{
	
	public void showAudi(){
		super.show();
		System.out.println("show Audi");
	}
	
}
public class Final2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Audi().showAudi();
		
	}

}
