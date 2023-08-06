package test2;

public class Test2Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=323;
		int newnum=0;
		int m=num;
		while(num>0) {
			int rem=num%10;
			newnum=10*newnum+rem;
			num=num/10;
		}
		System.out.println(newnum);
		if(m==newnum) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}

	}

}
