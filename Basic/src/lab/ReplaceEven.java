package lab;

import java.util.Arrays;

public class ReplaceEven {
	
	public void repElement(int a[]) {
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sk[]= {1,6,9,48,49};
		System.out.println(Arrays.toString(sk));
		
		ReplaceEven rl= new ReplaceEven();
		rl.repElement(sk);
		
	}

}
