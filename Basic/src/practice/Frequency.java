package practice;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,6,3,9,1,3,5};
		for (int i=0;i<a.length;i++) {
			boolean visited=false;
			int count=0;
			for (int j=i-1;j>=0;j--) {
				if(a[i]==a[j]) {
					visited=true;
					break;
				}
			}
			if(visited==false) {
				for (int k=1;k<a.length;k++) {
					if(a[i]==a[k]) {
						count++;
						
					}
				}
				System.out.println(a[i]+" "+count);
			}
		}

	}

}
