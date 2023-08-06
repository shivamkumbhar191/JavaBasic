package arrays;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {1,2,3,4,5};
		int first=b[0];
		for(int i=0;i<b.length-1;i++) {
			b[i]=b[i+1];
		}
		b[b.length-1]=first;
		System.out.println(Arrays.toString(b));
	}

}
