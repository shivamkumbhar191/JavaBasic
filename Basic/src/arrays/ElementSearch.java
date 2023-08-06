package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ElementSearch {
	public void findElement(int sk[],int x) {
		boolean isPresent=false;
		for (int i=0;i<sk.length;i++) {
			if(x==sk[i]) {
				isPresent=true;
				break;
				//System.out.println("the element "+sk[i]+" is found at index "+i);
			}
		}
		if (isPresent==true) {
			System.out.println("element is present");
		}
		else {
			System.out.println("element is not present");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,2,3,9,4};
		Scanner sc= new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		System.out.println("enter the element");
		int x=sc.nextInt();
		ElementSearch el= new ElementSearch();
		el.findElement(a, x);
		sc.close();
		
		
		
		
		

	}

}
