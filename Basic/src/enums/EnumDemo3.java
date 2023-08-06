package enums;

import java.util.Scanner;

enum MovieTicket{
	 STANDARD(300),PREMIUM(600),RECLINER(800);
	int price;
	
	// by default private
	MovieTicket(int price) {
		this.price=price;
	}
}

public class EnumDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the ticket type");
		System.out.println("1.standard\n2.premium\n3.recliner");
		int type=sc.nextInt();
		System.out.println("enter the no of tickets");
		int tkt=sc.nextInt();
		
		MovieTicket mt=null;
		switch(type) {
		case 1:mt=MovieTicket.STANDARD;
		break;
		case 2:mt=MovieTicket.PREMIUM;
		break;
		case 3:mt=MovieTicket.RECLINER;
		break;
		default:System.out.println("error...");
		}
		
		System.out.println("the total cost of "+tkt+" tickts is "+tkt*(mt.price));
		sc.close();

	}

}
