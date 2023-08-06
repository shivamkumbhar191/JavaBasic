package arrays;

import java.util.Scanner;

public class AlternateChar {
	
	public void replcedChar(char arr[]) {
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>='A' &&  arr[i]<='Z') {
				arr[i]=(char)(arr[i]+2);
			}
			else if (arr[i]>='a' && arr[i]<='z') {
				arr[i]= (char)(arr[i]+2);
			}
			else {
				arr[i]= arr[i];
			}
			System.out.println(arr[i]);
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		char ch[]=new char[6];
		System.out.println("enter character ");
		for (char i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
		}
		AlternateChar ac= new AlternateChar();
		ac.replcedChar(ch);
		sc.close();
	}

}
