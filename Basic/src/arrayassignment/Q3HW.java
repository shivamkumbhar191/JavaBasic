package arrayassignment;

import java.util.Arrays;

public class Q3HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 90, 45, 29, 37, 78};
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
