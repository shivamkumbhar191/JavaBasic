package lab;

interface Bus{
//	Bus(){
//		
//	}
//	Bus(int n){
//		
//	}
	
	void wheel();
	void company();
	void price();
	void type();
}
class Volvo9400 implements Bus{
	public void wheel() {
		System.out.println("16");
		this.company();
	}
	public void company() {
		System.out.println("volvo");
		this.price();
	}
	public void price() {
		System.out.println("90 lakh");
		this.type();
	}
	public void type() {
		System.out.println("Ac ");
	}
	
}

public class Interaface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Volvo9400().wheel();

	}

}
