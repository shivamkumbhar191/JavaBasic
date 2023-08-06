package arrayassignment;

public class Q6 {
	public static int averageint(double a[]) {
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum=(int)(sum+a[i]);
		}
		int avg=sum/a.length;
		return avg;
	}
	public static double average(double b[]) {
		int sum=0;
		for (int i=0;i<b.length;i++) {
			sum=(int) (sum+b[i]);
		}
		double avg=sum/b.length;
		return avg;
	}

	public static void main(String[] args) {
		//average of array elements
		double[] a= {1,5,8,9,6};
		System.out.println(averageint(a));
		System.out.println(average(a));
	

	}

}
