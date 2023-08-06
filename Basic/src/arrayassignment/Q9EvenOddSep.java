package arrayassignment;

import java.util.Arrays;

public class Q9EvenOddSep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,48,72,89,80,63};
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evencount++;
				
			}
			else {
				oddcount++;
			}
		}
		
		int even[]=new int[evencount];
		int odd[]=new int [oddcount];
		int idxevn=0;
		int idxodd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[idxevn++]=a[i];
			}
			else {
				odd[idxodd++]=a[i];
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));

	
	}

}
