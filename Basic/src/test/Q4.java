package test;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 123;
		int sum=0;
		int multi=1;
		while(num>0) {
			int digit=num%10;
			sum= sum+digit;
			multi=multi*digit;
			num=num/10;
			
		}
		if(sum==multi) {
			System.out.println("spy number");
		}
		else {
			System.out.println("not spy number");
		}

	}

}
