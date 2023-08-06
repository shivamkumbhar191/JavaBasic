package exception;

public class MulticatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="uday";
		try {
			System.out.println(s.charAt(9));
		}
		catch(IndexOutOfBoundsException e1) {
			System.out.println("String Index");
		}
		catch(RuntimeException e6) {
			System.out.println("runtime String exception");
		}
		catch(Exception e2) {
			System.out.println(e2.getMessage());
		}
		
		finally {
			System.out.println("handeled");
		}

	}

}
