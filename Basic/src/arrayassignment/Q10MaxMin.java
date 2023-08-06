package arrayassignment;

public class Q10MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {65,72,80,94,24,48,11};
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(max+" "+min);

	}

}
