package exception;

import java.util.Arrays;

public class ParseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="9763";
		int a=Integer.parseInt(num);
		System.out.println(a);
		
		String n="65.80";
		float b=Float.parseFloat(n);
		System.out.println(b);
		
		String s="1234";
		short st=Short.parseShort(s);
		System.out.println(st);
		
		String bn="troe";
		boolean bl=Boolean.parseBoolean(bn);
		System.out.println(bl);
		
		String d="65.4512";
		double dl=Double.parseDouble(d);
		System.out.println(dl);
		
		String l="7894561237";
		long lh=Long.parseLong(l);
		System.out.println(lh);
		
		String c="z"; 
		//char c1=Character.parseCharacter(c);
		char ch=c.charAt(0);
		char cr[]=c.toCharArray();
		System.out.println(ch+" "+Arrays.toString(cr));
		

	}

}
