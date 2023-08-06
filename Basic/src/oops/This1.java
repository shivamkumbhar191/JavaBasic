package oops;

public class This1 {
	int n;
	
	This1(int z){
		this();        //this use3
		System.out.println("c1");
		System.out.println(z);
	}
	This1(){
		System.out.println("C2");
	}
	
	public void show(int n) {
		this.n=n;   //this use1
		show1();   //this use2
		System.out.println("this m1");
		
	}
	public void show1() {
		System.out.println("this m2");
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This1 t=new This1(72);
		t.show(48);

	}

}
