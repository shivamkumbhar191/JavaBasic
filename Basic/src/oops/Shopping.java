package oops;

public class Shopping {
	int prodId;
	String prodName;
	int quntity;
	int prodPrice;
	int total;
	
	public void acceptDetails(int id,String name,int qun,int price) {
		prodId=id;
		prodName=name;
		quntity=qun;
		prodPrice=price;
	}
	public void calculateBill() {
		
			total=quntity*prodPrice;
			
	}
	public void displayDeatailsBill() {
		if(quntity!=0){
			System.out.println(prodId+" "+prodName+" "+quntity+" "+prodPrice+" "+total);
		}
		else {
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping shp=new Shopping();
		shp.acceptDetails(448, "zara coat",3,4500);
		shp.calculateBill();
		shp.displayDeatailsBill();
		

	}

}
