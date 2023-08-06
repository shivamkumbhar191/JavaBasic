package lab;

import java.util.Arrays;

public class StringArray {
	public void checkLength(String a[]) {
		
		String maxlen=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>maxlen.length()) {
				maxlen=a[i];
				System.out.println(maxlen);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"india","is","beutifull","country"};
		System.out.println(Arrays.toString(a));
		StringArray sr= new StringArray();
		sr.checkLength(a);
		

	}

}
