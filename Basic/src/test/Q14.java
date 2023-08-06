package test;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		int first=0;
		int second=1;
		int third;
		System.out.print(first+", "+second+", ");
		for (int i=3;i<=num;i++) {
			third=first+second;
			System.out.print(third+", ");
			first=second;
			second=third;
		}

	}

}
