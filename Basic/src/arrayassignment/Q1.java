package arrayassignment;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sk[]= new int[6];
		sk[0]=11;
		sk[1]=42;
		sk[2]= 73;
		sk[3]=49;
		sk[4]=94;
		sk[5]=80;
		
		for (int i=0;i<=sk.length-1;i++) {
			System.out.println(sk[i]);
		}
		
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		if (a==b) {
			System.out.println("same"+a+" " +b);
		}
		else {
			System.out.println("not"+a+" " +b);
		}

	}

}
