package arrayassignment;

public class Q5Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sk[]= {94,21,72,49,80};
		for(int i=sk.length-1;i>=0;i--) {
			System.out.print(sk[i]+" ");
		}
		System.out.println();
		//alternate element backward
		for (int i=sk.length-1;i>=0;i--) {
			if(i%2==0) {
				System.out.println(sk[i]);
			}
		}

	}

}
