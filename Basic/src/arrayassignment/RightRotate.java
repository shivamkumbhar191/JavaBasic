package arrayassignment;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		int last=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=last;
		System.out.println(Arrays.toString(a));
		
		

	}

}
