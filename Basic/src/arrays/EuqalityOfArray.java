package arrays;

import java.util.Arrays;

public class EuqalityOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,22,32,42,52};
		int b[]= {52,22,12,42,32};
		System.out.println(checkequality(a,b));

	}

	public static boolean checkequality(int[] a, int[] b) {
		boolean equal=true;
		if(a.length==b.length) {
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					equal= false;
					break;
				}
				else{
					equal= true;
				}
			}
		}else {
			equal= false;
		}
		return equal;
	}

}
