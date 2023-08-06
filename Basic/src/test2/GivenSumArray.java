package test2;

public class GivenSumArray {
	
	

	public static void main(String[] args) {
		int a[]= {2,4,3,5,6,-2,4,7,8,9};
		
		int sum=7;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(sum==(a[i]+a[j])) {
					 System.out.println(a[i]+" "+a[j]);
				}
			}
			if(a[i]==sum) {
				System.out.println(a[i]);
			}
		}
		
	}

}
