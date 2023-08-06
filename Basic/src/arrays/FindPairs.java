package arrays;

public class FindPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,8,3,1,9,7,10,12,5};
		int sum=15;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
		
	}

}
