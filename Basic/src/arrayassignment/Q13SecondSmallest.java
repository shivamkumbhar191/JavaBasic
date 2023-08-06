package arrayassignment;

import java.net.Inet4Address;

public class Q13SecondSmallest {

	public static void main(String[] args) {
		int a[]= {65,72,9,7,1,80,94,7,48};
		withoutswaping(a);
	//	secondsmallest(a);

	}

	public static void secondsmallest(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second smallest element is "+a[1]);
		
	}

	public static void withoutswaping(int[] a) {

		if(a.length<2) {
			System.out.println("no second smallest element");
		}
		int smallest=a[0];
		int secondsmallest=a[1];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				secondsmallest=smallest;
				smallest=a[i];
			}else if(a[i]<secondsmallest && a[i]>smallest) {
				secondsmallest=a[i];
			}
		}
		if(secondsmallest==smallest || secondsmallest==a[1] ){
			System.out.println("no smallest element");
		}
		else {
			System.out.println(secondsmallest);
		}
		
	}

}
