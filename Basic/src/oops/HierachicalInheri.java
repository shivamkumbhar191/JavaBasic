package oops;

class Fruit{
	String colour;
	String taste;
	int price;
	
	Fruit(String colour,String taste,int price){
		this.colour=colour;
		this.taste=taste;
		this.price=price;
		this.showFruits();

	}
	public void showFruits() {
		System.out.println(colour+" "+taste+" "+price );	
	}

}
class Mango extends Fruit{	
	Mango(){
		super("Yellow", "sweet", 1000);
	}
	
}
class Straberry extends Fruit{
	Straberry(){
		super("red","sweet",300);
	}
	
}
class Kiwi extends Fruit{
	Kiwi(){
		super("chocalate","sour",200);	
	}

}
public class HierachicalInheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit ft1= new Mango(),ft2=new Straberry(),ft3=new Kiwi();

	}

}
