package exception;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		Integer i=new Integer(a); //boxing
		Integer n=a;   //Autoboxing
		
		char ch='k';
		Character c=new Character(ch);
		Character c1=ch;
		
		float f=6.5f;
		Float ft= new Float(f);
		Float f1=f;
		
		double d=78.80;
		Double dl=new Double(d);
		Double dle=d;
		
		short s=4545;
		Short st= new Short(s);
		Short st1=s;
		
		long l=1234567891456789456L;
		Long lg=new Long(l);
		Long ln=l;
		
		boolean b= true;
		Boolean bl=new Boolean("Trrue");
		Boolean bn=b;
		System.out.println(bl);
		
		
		
		
		
		
		
		
		

	}

}
