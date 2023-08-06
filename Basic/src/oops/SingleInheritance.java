package oops;

class Cars
{
	int i;
	String type="Sedan";
	public void display() {
		System.out.println(i);
	}
}
class Volvo extends Cars 
{
	int wheel;
	int price;
	int colour;
	int volume;
	
	Volvo(){
		wheel=5;
		price=5;
		colour=6;
	
		
	}
	int j;
	
	public void display() {
		System.out.println(j);
	}
	
	public void showCar() {
		System.out.println(type+" "+wheel+" "+price+" "+colour);
	}
	void volume() {
		volume=wheel*price*colour;
	}
}

public class SingleInheritance {
	

	public static void main(String[] args) {
		Volvo v= new Volvo();
		v.i=1;
		v.j=2;
		Cars r;
		r=v;
		
		v.volume();
		System.out.println(v.volume);
	
		
	

	}

}
