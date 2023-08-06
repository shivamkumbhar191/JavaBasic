package controlstmts;

public class BreakContinue {

	public static void main(String[] args) {
		// display number between 1 to 20 if any number is divisible by 4 and 6 the stop the loop
		for (int i=1;i<=20;i++) {
			if (i%4==0 && i%6==0) {
				break;
			}
			System.out.println(i);
		}
		
		//display number between 1 to 30 skip the number which is divisible by 3
		System.out.println("====================");
		for (int i=1;i<=30;i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		//display number between 1 to 30 skip the number which is divisible by 3 using while loop
		System.out.println("====================");
		int num=1;
		while(num<=30) {
			if (num%3==0) {
				num++;
				continue;
			}
			System.out.println(num);
			num++;
		}
		
		
		

	}

}
