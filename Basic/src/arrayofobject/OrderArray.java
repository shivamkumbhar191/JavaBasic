package arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

class Order{
	int oid;
	String customerName;
	int oquntity;
	OrderStatus os;
	
	Order(int oid,String customerName,int oquntity,OrderStatus os){
		this.oid=oid;
		this.customerName=customerName;
		this.oquntity=oquntity;
		this.os=os;
	}
	
	public String toString () {
		return oid+" "+customerName+" "+oquntity+" "+os;	
	}
	
}
class OrderStatus{
	String status;
	OrderStatus(String status){
		this.status=status;
	}
	public String toString() {
		return status;
	}
}

public class OrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order od[]=new Order[3];
		Scanner sc= new Scanner(System.in);
		for (int i=0;i<od.length;i++) {
			System.out.println("enter the order id");
			int id=sc.nextInt();
			System.out.println("enter the customer name");
			String cName=sc.next();
			System.out.println("enter the order quntity");
			int qun=sc.nextInt();
			System.out.println("enter the order status");
			String sta=sc.next();
			OrderStatus o= new OrderStatus(sta);
			Order or=new Order(id,cName,qun,o);
			od[i]=or;
			
			
		}
		
		System.out.println(Arrays.toString(od));
		
		System.out.println("============================================================");
		
		for (int i=0;i<od.length;i++) {
			if(od[i].oquntity>=2) {
			System.out.println(od[i].oid+" "+od[i].customerName+" "+od[i].oquntity+" "+od[i].os);
			}
		}
		sc.close();

	}

}
