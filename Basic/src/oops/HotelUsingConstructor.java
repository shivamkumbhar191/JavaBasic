package oops;

public class HotelUsingConstructor {
	
	private int id;
	private String hotelName;
	private Menu menuItem;
	
	HotelUsingConstructor(int id,String hotelName,Menu menuItem ){
		this.id=id;
		this.hotelName=hotelName;
		this.menuItem=menuItem;	
	}
	
	public void showMenu() {
		System.out.println(id+" "+hotelName);
		menuItem.showMenuItem();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m=new Menu(204,"dalbati",700);
		HotelUsingConstructor ht= new HotelUsingConstructor(1650,"Classio",m);
		ht.showMenu();
		
	}
	
}
class Menu{
	private int id;
	private String menuName;
	private int price;
	
	Menu(int id,String menuName,int price){
		this.id=id;
		this.menuName=menuName;
		this.price=price;
	}
	public void showMenuItem() {
		System.out.println(id+" "+menuName+" "+price);
		
	}
}

