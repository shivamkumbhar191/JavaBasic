package lab;

import java.util.Arrays;

public class CharSort {
	
	public void descsort(char c[]) {
		for (int i=0;i<c.length;i++) {
			for (int j=i+1;j<c.length;j++) {
				if (c[i]<c[j]) {
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'k','h','u','i','s','A'};
		
		CharSort cs= new CharSort();
		cs.descsort(ch);

	}

}
