package oops;

public class GetterSetterBag {
	
	private String brandName;
	private String colour;
	private int price;
	private Pen pn;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Pen getPn() {
		return pn;
	}
	public void setPn(Pen pn) {
		this.pn = pn;
	}
	

}
class Pen{
	private String penName;
	private String colour;
	private int price;
	private Nib nb;
	public String getPenName() {
		return penName;
	}
	public void setPenName(String penName) {
		this.penName = penName;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Nib getNb() {
		return nb;
	}
	public void setNb(Nib nb) {
		this.nb = nb;
	}
	
}
class Nib{
	private String material;
	private int price;
	
	public void setMaterial(String material) {
		this.material=material;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getMaterial() {
		return material;
	}
	public int getPrice() {
		return price;
	}
	
}
