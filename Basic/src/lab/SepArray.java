package lab;

import java.util.Arrays;

public class SepArray {
	
	public void sepOddEven(int a[]) {
		for (int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				continue;
			}
			for (int j=i+1;j<a.length;j++) {
				if(a[j]%2!=0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}		
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sk[]= {1,2,3,4,5};
		SepArray sa= new SepArray();
		sa.sepOddEven(sk);

	}

}
