package arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

class Courses{
	int cid;
	String cName;
	Studentt stu;
	Courses(int cid,String cName,Studentt stu){
		this.cid=cid;
		this.cName=cName;
		this.stu=stu;
	}
	
	public String toString() {
		return cid+" "+cName+" "+stu;
	}
	
}
class Studentt {
	int sid;
	String sname;
	Studentt(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
			
	}
	public String toString() {
		return sid+" "+sname;
	}
	
	
}

public class StudentArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses c[]= new Courses[2];
		
//		c[0]=new Courses(101,"java",new Studentt(441,"Shivam"));
//		c[1]= new Courses(102,"c#",new Studentt(445,"uday"));
		
		Scanner sc= new Scanner(System.in);
		for (int i=0;i<c.length;i++) {
			System.out.println("enter the cid");
			int cid=sc.nextInt();
			System.out.println("enter the course name");
			String cname=sc.next();
			System.out.println("enter the Student id"); 
			int sid= sc.nextInt();
			System.out.println("enter the student name");
			String sname= sc.next();
			
//			Studentt stu= new Studentt(sid,sname);
//			Courses cs= new Courses(cid,cname,stu);
//			c[i]=cs;
			
			c[i]=new Courses(cid,cname,new Studentt(sid,sname));
		}
		
		
//		for (int i=0;i<c.length;i++) {
//			System.out.println(c[i].cid+" "+c[i].cName+" "+c[i].stu.sid+" "+c[i].stu.sname );
//		}
		
		System.out.println(Arrays.toString(c));
		sc.close();

	}

}
