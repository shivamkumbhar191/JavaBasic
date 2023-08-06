package arrayassignment;

public class Q8NegativeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {4,5,-1,8,-6,-2,9};
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]<0) {
				System.out.print(b[i]+" ");
				count++;
			}
		}
		System.out.println("\n"+count);
		

	}

}
