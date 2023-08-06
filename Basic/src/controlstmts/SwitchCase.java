package controlstmts;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		switch(num) {
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("invalid number");
		}
		System.out.println("enter the character");
		char ch= sc.next().charAt(0);
		switch(ch) {
		case 'a':System.out.println("vowel");
		break;
		case 'e':System.out.println("vowel");
		break;
		case 'i':System.out.println("vowel");
		break;
		case 'o':System.out.println("vowel");
		break;
		case 'u':System.out.println("vowel");
		break;
		case 'A':System.out.println("vowel");
		break;
		case 'E':System.out.println("vowel");
		break;
		case 'I':System.out.println("vowel");
		break;
		case 'O':System.out.println("vowel");
		break;
		case 'U':System.out.println("vowel");
		break;
		default:System.out.println("consonant");
		}
		
		//number is odd or even using switch case
		System.out.println("enter the number");
		int num2=sc.nextInt();
		switch(num2%2) {
		case 0:System.out.println("number is even");
		break;
		case 1:System.out.println("number is odd");
		break;
		default:System.out.println("invalid number");
		}
		
		//print number 1 to 5 using switch case
		int num3=1;
		switch(num3) {
		case 1:System.out.println("1");
		case 2:System.out.println("2");
		case 3:System.out.println("3");
		case 4:System.out.println("4");
		case 5:System.out.println("5");
		break;
		default :System.out.println("Inavalid number");
		
		}
		
		sc.close();
		
	

	}

}
