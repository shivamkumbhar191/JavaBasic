package oops;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetterPerson gsp=new GetterSetterPerson();
		gsp.setId(223);
		gsp.setName("zenith");
		gsp.setAddress(new Address());
		
		Address a=gsp.getAddress();
		a.setPincode(412105);
		a.setHouseNo(1693);
		a.setCity("pune");
		
		System.out.println(gsp.getId());
		System.out.println(gsp.getName());
		System.out.println(a.getPincode());
		System.out.println(a.getHouseNo());
		System.out.println(a.getCity());

	}

}
