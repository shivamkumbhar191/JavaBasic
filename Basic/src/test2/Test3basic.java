package test2;

public class Test3basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,6,10,17,2,8,1};
		int n=11;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==n) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

}
