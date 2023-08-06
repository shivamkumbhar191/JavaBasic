package arrays;

import java.util.Arrays;

public class MergeAlternat {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,110,120,130};
		int b[]= {60,70,80,90,100};
		int max=0;
		if(a.length>b.length) {
				max=a.length;
		}else {
			max=b.length;
		}	
		int c[]= new int[max];
		if(b.length>a.length) {
			for(int i=a.length;i<b.length;i++) {
			c[i]=b[i];
			}
		}else {
			for(int j=b.length;j<a.length;j++) {
				c[j]=a[j];
			}
		}
		for(int i=0;i<a.length;i=i+2) {
			for(int j=1;j<b.length;j=j+2) {
				if(j%2!=0) {
					c[j]=b[j];
				}
			}
			c[i]=a[i];
		}
		System.out.println(Arrays.toString(c));
		
	}

}
