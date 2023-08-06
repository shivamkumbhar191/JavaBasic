package oops;

public class Final1 {
	
	static final int a;
	
	static {
		a=48;
	}
	Final1(){
		//a=700;
	}
	public void accept() {
		//a=400;
	}
	public void show() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final1 f= new Final1();
		f.show();
		 Child child = new Child();

	}

}
class Parent {
    Parent() {
        System.out.println("S1");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("S2");
    }
}



