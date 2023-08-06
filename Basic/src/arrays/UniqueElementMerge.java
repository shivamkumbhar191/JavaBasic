package arrays;

import java.util.Arrays;

public class UniqueElementMerge {
	
	public void uniqueNumMerge(int a[],int b[],int c[]) {
		int k=0;
		for (int i=0;i<a.length;i++) {
			c[k]=a[i];
			k++;
		}
		for (int i=0;i<b.length;i++) {
			boolean visited=false;
			for (int j=k-1;j>=0;j--) {
				if(b[i]==c[j]) {
					visited=true;
					break;
				}
			}
			if (visited==false) {
				c[k]=b[i];
				k++;
			}
			
		}
		System.out.println(Arrays.toString(c));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,20};
		int b[]= {30,40,90,80,90};
		
		int c[]= new int[a.length+b.length];
		
		UniqueElementMerge ul= new UniqueElementMerge();
		ul.uniqueNumMerge(a, b, c);
		
		

	}

}
