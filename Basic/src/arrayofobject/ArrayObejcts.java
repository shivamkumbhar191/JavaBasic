package arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

class Department{
	int id;
	String name;
	Employee emp;
	Department(int id,String name,Employee emp){
		this.id=id;
		this.name= name;
		this.emp=emp;
		
	}
	public String toString() {
		return id+" "+name+" "+emp;
	}
	
}
class Employee{
	int eid;
	int esalary;
	String ename;
	Employee(int eid,int esalary,String ename){
		this.eid=eid;
		this.esalary=esalary;
		this.ename=ename;
		
	}
	public String toString() {
			return eid+" "+esalary+" "+ename;
			
	}
	
}

public class ArrayObejcts {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d[]= new Department[2];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the details");
		for (int i=0;i<d.length;i++) {
			System.out.println("enter the dep id");
			int id= sc.nextInt();
			System.out.println("enter the dep name");
			String name= sc.next();
			System.out.println("enter the emp id");
			int eid=sc.nextInt();
			System.out.println("enter the emp name");
			String ename=sc.next();
			System.out.println("enter the salary");
			int esalary=sc.nextInt();
			Employee em= new Employee(eid,esalary,ename);
			d[i]=new Department(id,name,em);
	
		}
		System.out.println(Arrays.toString(d));
		
		for (int i=0;i<d.length;i++) {
			if(d[i].emp.esalary>=30000) {
				System.out.println(d[i].id+" "+d[i].name+" "+d[i].emp.eid+" "+d[i].emp.ename+" "+d[i].emp.esalary);
			}
		}
	
		sc.close();
		

	}

}
