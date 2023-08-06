package test;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=5;i>=1;i--) {
			for (int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
