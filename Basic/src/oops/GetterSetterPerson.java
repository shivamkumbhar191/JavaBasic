package oops;

public class GetterSetterPerson {
	
	private int id;
	private String name;
	private Address adr;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAddress(Address adr) {
		this.adr=adr;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return adr;
	}
}
class Address{
		private int pincode;
		private String city;
		private int houseNo;
		
		public void setPincode(int pincode) {
			this.pincode=pincode;
		}
		public void setCity(String city) {
			this.city=city;
		}
		public void setHouseNo(int houseNo) {
			this.houseNo=houseNo;
		}
		public int getPincode() {
			return pincode;
		}
		public  String getCity() {
			return city;
		}
		public int getHouseNo() {
			return houseNo;
		}
		
}
