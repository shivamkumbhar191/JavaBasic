package arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

class Students{
	int id;
	Course c;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	
	
	public String toString() {
		return id+" "+c;
	}
}

class Course{
	int id;
	String name;
	int fees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public String toString() {
		return id+" "+name+" "+fees;	
	}
	
	
}
public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students []st= new Students[2];
		Scanner sc= new Scanner (System.in);
		for(int i=0;i<st.length;i++) {
			System.out.println("enter the Student id");
			int sid=sc.nextInt();
			System.out.println("enter the course id");
			int cid=sc.nextInt();
			System.out.println("enter the course name");
			String cname=sc.next();
			System.out.println("enter the course fee");
			int fees=sc.nextInt();
			Students s= new Students();
			s.setId(sid);
			s.setC(new Course());
			s.getC().setId(cid);
			s.getC().setName(cname);
			s.getC().setFees(fees);
			
			st[i]=s;
				
		}
		System.out.println(Arrays.toString(st));
		
		sc.close();

	}

}
