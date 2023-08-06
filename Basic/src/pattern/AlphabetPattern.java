package pattern;

public class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i='A';i<='D';i++) {
			for (char j='A';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (char i='D';i>='A';i--) {
			for (char j='A';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (char i='A';i<='D';i++) {
			for (char j='D';j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
