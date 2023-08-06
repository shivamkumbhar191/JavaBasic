package oops;

class Animal{
	
}
class Cat extends Animal {
	
}
class Test{
	
	public void m1(Animal a){
		System.out.println("animal");
	}
	public void m1(Cat m){
		System.out.println("Cat");
		
	}

}

public class OverloadingCompliler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.m1(new Animal());
		t.m1(new Cat());
		
		Animal a=new Animal();
		t.m1(a);
		
		Cat c= new Cat();
		t.m1(c);
		
		Animal a1= new Cat();
		t.m1(a1);
	

	}

}
