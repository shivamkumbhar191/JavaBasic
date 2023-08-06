package arrayassignment;

public class Q11DuplicateElement {

	public static void main(String[] args) {
		int a[]= {11,48,24,39,61,11,48};
		for(int i=0;i<a.length;i++) {
			boolean isvisited=false;
			int count=1;
			for(int k=i-1;k>=0;k--) {
				if(a[i]==a[k]) {
					isvisited=true;
					break;
				}
			}
			if(isvisited==false) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					}
				}
				if(count>1) {
					System.out.println(a[i]+" "+count);
				}
			}
		}

	}

}
