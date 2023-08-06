package exception;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a=new Integer(48);  //deprecated
		int n=a.intValue(); //unboxing
		int m=a;   //Autounboxing
		
		Float f=new Float(6.5);
		float fl=f.floatValue();
		float ft=f;
		System.out.println(ft);
		
		Character ch=new Character('s');
		char cr=ch.charValue();
		char c=ch;
		
		Double d= new Double(65.78);
		double dl=d.doubleValue();
		double dle=d;
		
		Short s= new Short((short) 456544);
		
		short ts=s.shortValue();
		short st=s;
		
		Long l= new Long(4567891234L);
		long ln=l.longValue();
		long lg=l;
		
		Boolean b=new Boolean("TruE");
		boolean bm= b.booleanValue();
		boolean bl=b;
		System.out.println(bl);
		
		
		
		
		
		

	}

}
