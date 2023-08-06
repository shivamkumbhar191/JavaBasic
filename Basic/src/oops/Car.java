package oops;

public class Car {
	
	String modelNo;
	String carName;
	double carPrice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.modelNo="i4";
		car1.carName="BMW";
		car1.carPrice=73.90;
		System.out.println(car1.carName);
		System.out.println(car1.modelNo);
		System.out.println(car1.carPrice);
		
		Car car2=new Car();
		car2.carName="BMW M40i";
		car2.modelNo="Z4";
		car2.carPrice=147.50;
		System.out.println(car2.carName);
		System.out.println(car2.modelNo);
		System.out.println(car2.carPrice);
		
		Car car3=new Car();
		car3.carName="BMW M40i";
		car3.modelNo="X3";
		car3.carPrice=86.50;
		System.out.println(car3.carName);
		System.out.println(car3.modelNo);
		System.out.println(car3.carPrice);
		
	}

}
