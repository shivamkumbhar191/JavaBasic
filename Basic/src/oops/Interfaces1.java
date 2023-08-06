package oops;

interface Animall{
	void walk();
	void bark();
	void eat();
}
interface Bird {
	void fly();
	void feather();
	
}

class Dog implements Animall, Bird{
	
	public void walk() {
		System.out.println("walking");
	}
	public void bark(){
		System.out.println("boww boww");
	}
	public void eat(){
		System.out.println("roti");
	}
	public void fly() {
		System.out.println("high");
		}
	public void feather() {
		System.out.println("big");
	}
}


public class Interfaces1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animall a= new Dog();
		a.walk();
		a.bark();
		a.eat();
		Bird b= new Dog();
		b.fly();
		b.feather();

	}

}
