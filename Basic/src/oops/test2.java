package oops;

abstract class Carrr{
	Carrr(){
		System.out.println("car is running");
	}
	abstract void gearChanged();
	void showCar() {
		System.out.println("GMC is running fast");
	}

}
class GMC extends Carrr{
	void gearChanged() {
		System.out.println("gear is changed");
	}
	
}

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carrr gc= new GMC();
		gc.gearChanged();
		gc.showCar();
	
	}

}
