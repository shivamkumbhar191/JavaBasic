package oops;

public class Bag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetterBag bg= new GetterSetterBag();
		bg.setBrandName("zara");
		bg.setColour("mooron");
		bg.setPrice(35000);
		bg.setPn(new Pen());
		
		Pen p=bg.getPn();
		p.setPenName("maxtron");
		p.setColour("blue");
		p.setPrice(100);
		p.setNb(new Nib());
		
		Nib n=p.getNb();
		n.setMaterial("copper");
		n.setPrice(15);
		
		System.out.println(bg.getBrandName());
		System.out.println(bg.getColour());
		System.out.println(bg.getPrice());
		System.out.println(p.getPenName());
		System.out.println(p.getColour());
		System.out.println(p.getPrice());
		System.out.println(n.getMaterial());
		System.out.println(n.getPrice());

	}

}
