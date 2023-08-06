package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4 };
		try {
			System.out.println(arr[6]);
		} 
		catch (IndexOutOfBoundsException e1) {
			System.out.println("index exception");

		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("done...");
		}

	}

}
