package lab;

public class SparseMatrix {
	public void checkSparse(int a[][]) {
		
		int zero=0;
		int nonzero=0;
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				if(a[i][j]==0) {
					zero++; 
					nonzero=a.length*a[i].length-zero;
				}
							
			}
			
		}
		System.out.println(zero+" zero elements in given matrix ");
		if(zero>nonzero) {
			System.out.println("sparse matrix");
		}
		else {
			System.out.println("not sparse matrix");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{0,0,7},{0,9,4},{1,8,0}};
		SparseMatrix sm= new SparseMatrix();
		sm.checkSparse(a);
		

	}

}
