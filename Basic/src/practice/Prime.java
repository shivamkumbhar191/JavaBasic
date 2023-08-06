package practice;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=1;i<=n;i++) {
			boolean prime=true;
			for (int j=2;j<i;j++) {
				if(i%j==0) {
					prime=false;
					break;
				}
			}
			if(prime==true) {
				System.out.println(i);
			}
		}

	}

}
