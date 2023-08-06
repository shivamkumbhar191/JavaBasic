package arrayassignment;

public class Q14Fequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5,1,7,3,2,5};
		for(int i=0;i<a.length;i++) {
			int count=1;
			boolean visited=false;
			for(int j=i-1;j>=0;j--) {
				if(a[i]==a[j]) {
					visited=true;
					break;
				}
			}
			if(visited==false) {
				for(int k=i+1;k<a.length;k++) {
					if(a[i]==a[k]) {
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
		}

	}

}
