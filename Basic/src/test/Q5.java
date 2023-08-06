package test;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		int cub=num*num*num;
		int digit = cub%10;
		if(digit==num) {
			System.out.println("trimorphic number");
		}
		else {
			System.out.println("not trimorphic number");
		}

	}

}
