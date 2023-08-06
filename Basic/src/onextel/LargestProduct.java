package onextel;

import java.util.Arrays;

public class LargestProduct {
	
	public static void maxProduct(int product[]) {
		int maxProd=product[0];
		for(int i=0;i<product.length;i++) {
			if(maxProd<product[i]) {
				maxProd=product[i];
			}
		}
		System.out.println(maxProd);
	}

	public static void usingWhile(int num) {
		String str= Integer.toString(num);
		int product[]=new int[str.length()-2];
		int idx=0;
		while(num>100) {
			int prod=1;
			int dig=num%1000;
			while(dig>0) {
				int digit=dig%10;
				prod=prod*digit;
				dig=dig/10;	
			}
			product[idx]=prod;
			idx++;
			num=num/10;
		}
		System.out.println(Arrays.toString(product));
		maxProduct(product);
		

	}

	public static void usingWhileCount(int num) {
		String str=Integer.toString(num);
		int product[]=new int[str.length()-2];
		int idx=0;
		int num1=num;
		while(num>=100) {
			int count=1;
			int prod=1;
			while(count<4) {
				int dig=num%10;
				prod=prod*dig;
				num=num/10;
				count++;
			}
			product[idx]=prod;
			idx++;
			num1=num1/10;
			num=num1;
		}
		maxProduct(product);
	}
	
	public static void usingString(int num) {
		String str=Integer.toString(num);
		int product[]=new int[str.length()-2];
		int idx=0;
		for(int i=0;i<=str.length()-3;i++) {
			product[idx]=(str.charAt(i)-48)*(str.charAt(i+1)-48)*(str.charAt(i+2)-48);
			idx++;
		}
		maxProduct(product);
	}

	public static void main(String[] args) {
		// largest product from given number
		int num=95834;
		usingWhile(num);
		usingWhileCount(num);
		usingString(num);
	}
}
