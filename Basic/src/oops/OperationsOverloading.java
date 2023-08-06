package oops;

public class OperationsOverloading {
	
	int add;
	float sub;
	double multi;
	float div;
	
	public void opertaions(int a,int b) {
		add=a+b;	
	}
	public void opertaions(long a,int b) {
		sub=a-b;
	}
	public void opertaions(double a,int b) {
		multi=a*b;
	}
	public void opertaions(int a,float b) {
		div=a/b;
	}
	public void display() {
		System.out.println(add+"  "+sub+"  "+multi+"  "+div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationsOverloading op=new OperationsOverloading();
		op.opertaions(10, 20);
		op.opertaions(500L, 60);
		op.opertaions(112.5, 12);
		op.opertaions(10, 3.14f);
		
		op.display();
		

	}

}
