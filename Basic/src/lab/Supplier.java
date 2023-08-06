package lab;

class Item{
	private int imId;
	private String imName;
	private int price;
	
	public int getImId() {
		return imId;
	}
	public void setImId(int imId) {
		this.imId = imId;
	}
	public String getImName() {
		return imName;
	}
	public void setImName(String imName) {
		this.imName = imName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class Supplier {
	private int sId;
	private String sName;
	private Item im;
	

	public int getsId() {
		return sId;
	}


	public void setsId(int sId) {
		this.sId = sId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public Item getIm() {
		return im;
	}


	public void setIm(Item im) {
		this.im = im;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier sl= new Supplier();
		sl.setsId(3348);
		sl.setsName("zara");
		sl.setIm(new Item());
		
		
		Item itm=sl.getIm();
		itm.setImId(445512);
		itm.setImName("zara coat 3");
		
	}

}

