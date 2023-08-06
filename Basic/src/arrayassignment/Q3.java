package arrayassignment;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sk[]= {94,21,72,49,80};
		System.out.println("enter the element");
		int x=sc.nextInt();
		for (int i=0;i<sk.length;i++) {
			if(x==sk[i]) {
				System.out.println("the element "+sk[i]+" is found at index "+i);
			}
		}
		sc.close();

	}

}
