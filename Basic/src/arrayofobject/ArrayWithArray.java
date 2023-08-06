package arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	int id;
	String name;
	int marks[];
	Student(int id,String name,int marks[]){
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	public String toString () {
		return id+" "+name+" "+Arrays.toString(marks);
	}
	
}

public class ArrayWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s[]= new Student[2];
		Scanner sc= new Scanner(System.in);
		
		for (int i=0;i<s.length;i++) {
			System.out.println("enter the id");
			int id=sc.nextInt();
			System.out.println("enter the name");
			String name=sc.next();
			int marks[]=new int[3];
			System.out.println("enter the marks");
			for (int j=0;j<marks.length;j++) {
				marks[j]=sc.nextInt();
			
			}
			s[i]=new Student(id,name,marks);
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		sc.close();

	}

}

