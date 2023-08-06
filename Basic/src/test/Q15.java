package test;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum=0;
		int n=10;
		int sum = 0;
		int fact = 0;
		for (int i=1;i<=n;i++) {
			fact=1;
			sum=0;
			for (int j=1;j<=i;j++) {
				fact= fact*j;
				
				sum=sum+fact;
			}
			
		}
		System.out.println(fact);
		System.out.println(sum);

	}

}
