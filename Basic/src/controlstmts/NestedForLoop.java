package controlstmts;

public class NestedForLoop {

	public static void main(String[] args) {
		//calculate average of prime number between 1 to 10
		int count=0;
		int sum=0;
		for (int i=1;i<=10;i++) {
			boolean isprime=true;
			for (int j=2;j<i;j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
				
			}
			if(isprime==true) {
				count++;
				sum=sum+i;
				//System.out.println(i);
			}
		}
		System.out.println("the sum of prime number is "+sum);
		System.out.println("the total number of prime number is "+count);
		float avg= (float)sum/count;
		System.out.println("average of prime number between 1 to 10 is "+avg);
		
		//print table between 1 to 5
		int table=0;
		for (int i=1;i<=5;i++) {
			System.out.println("the table of "+i+" = ");
			for (int j=1;j<=10;j++) {
				table = i*j;
				System.out.println(table);
			}
		}
		
		//sum of factorial from 1 to 5
		int sum1=0;
		for (int i=1;i<=5;i++) {
			sum1=0;
			int fact=1;
			for (int j=1;j<=i;j++) {
				fact = fact*j;
				sum1= sum1 +fact;
			}
		}
		System.out.println("the sum of factorial from 1 to 5 is "+sum1);
		
		//find the frequency of each digit from the number
		int num=1148;
		int counter=0;
		for (int j=0;j<=9;j++) {
			while(num>0) {
				int digit=num%10;
				if(digit==j) {
					counter=counter+1;
					num=num/10;
				}
			}
		}

	}

}
