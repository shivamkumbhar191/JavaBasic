package oops;

public class CalculateOverload {
	int rectangleArea;
	double circleArea;
	int squareArea;
	float triangleArea;
	
	public void claculate(int a,int b) {
		rectangleArea=a*b;
	}
	public void claculate(double a,float r) {
		circleArea=(double)(a*r*r);
		
	}
	public void claculate(int a) {
		squareArea=a*a;
	}
	public void claculate(double a,int b) {
		triangleArea=(float)a*b/2;
			
	}
	public void Display() {
		System.out.println(rectangleArea+" "+circleArea+" "+squareArea+" "+triangleArea);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateOverload clc=new CalculateOverload();
		clc.claculate(10,15);
		clc.claculate(3.14,5f);
		clc.claculate(10);
		clc.claculate(100.50,20);
		
		clc.Display();
		

	}

}
