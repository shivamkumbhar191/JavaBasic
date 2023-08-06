package oops;

class Mobile{
	
	String type="screetouch";
	String used="Calling";
	
}
class GooglePixel extends Mobile{
	String OS;
	
	GooglePixel(String OS){
		this.OS=OS;
		this.displayGoogle();
	}
	public void displayGoogle() {
		System.out.println(OS);
	}
	
}
class Pixel7pro extends Mobile{
	int price;
	int storage;
	
	Pixel7pro(int price,int storage){
		this.price=price;
		this.storage=storage;
		this.displayPixel();
		
	}
	public void displayPixel() {
		System.out.println(type+" "+used+" "+" "+price+" "+storage);
		
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pixel7pro gp7=new Pixel7pro(70000,128);
		GooglePixel gp= new GooglePixel("Android");
		
				

	}

}
