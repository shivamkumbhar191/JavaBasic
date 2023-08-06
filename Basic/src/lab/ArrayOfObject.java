package lab;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	int id;
	String name;
	int marks[];
	float per;

	Student(int id, String name, int marks[] ) {
		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	public void calPer() {
		int sum = 0;
		for (int j = 0; j < marks.length; j++) {
			sum = sum + marks[j];
			per = (float)(sum *100)/ (marks.length*100);
		}
	}

	public String toString() {
		return id + " " + name + " " + Arrays.toString(marks) + " " + per;
	}
}

public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sd[] = new Student[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < sd.length; i++) {
			System.out.println("enter the id");
			int id = sc.nextInt();
			System.out.println("enter the name");
			String name = sc.next();
			int marks[] = new int[3];
			System.out.println("enter the marks");
			for (int j = 0; j < marks.length; j++) {
				marks[j] = sc.nextInt();
			}
			sd[i] = new Student(id, name, marks);
			sd[i].calPer();

		}
		System.out.println(Arrays.toString(sd));
		sc.close();

	}

}
