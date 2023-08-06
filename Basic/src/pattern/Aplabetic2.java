package pattern;

public class Aplabetic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=4;i>=1;i--) {
			for(int k=4;k>=4-i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
