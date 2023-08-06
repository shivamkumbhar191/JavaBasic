package lab;

public class Q2 {
	int rectangleArea;
	double circleArea;
	int squareArea;
	float triangleArea;
	
	public int claculate(int a,int b) {
		return rectangleArea=a*b;
	}
	public double claculate(double a,float r) {
		return circleArea=(double)(a*r*r);
		
	}
	public int claculate(int a) {
		return squareArea=a*a;
	}
	public float claculate(double a,int b) {
		return triangleArea=(float)a*b/2;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2  clc= new Q2();
		System.out.println(clc.claculate(10,15));
		System.out.println(clc.claculate(3.14,5f));
		System.out.println(clc.claculate(10));
		System.out.println(clc.claculate(100.50,20));
		
		

	}

}
